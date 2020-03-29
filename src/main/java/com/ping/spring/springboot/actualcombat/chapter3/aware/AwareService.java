package com.ping.spring.springboot.actualcombat.chapter3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Spring Aware的演示Bean
 * 实现BeanNameAware和ResourceLoaderAware接口，获得Bean名称和资源加载的服务。
 *
 * @author Ping
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    /**
     * 实现BeanNameAware需重写setBeanName方法
     *
     * @param name Bean名称
     */
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    /**
     * 实现ResourceLoaderAware需重写setResourceLoader
     *
     * @param resourceLoader Spring框架为了更方便的获取资源，尽量弱化程序员对各个Resource接口的实现类的感知，定义了另一个接口，就是：ResourceLoader接口。
     */
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("Bean的名称为: " + beanName);
        Resource resource = loader.getResource("classpath:com/ping/spring/springboot/actualcombat/chapter3/aware/test.txt");
        try {
            String text = IOUtils.toString(resource.getInputStream(), StandardCharsets.UTF_8);
            System.out.println("ResourceLoader加载的文件内容为: " + text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
