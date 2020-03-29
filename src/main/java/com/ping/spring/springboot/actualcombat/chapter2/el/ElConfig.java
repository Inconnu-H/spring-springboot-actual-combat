package com.ping.spring.springboot.actualcombat.chapter2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 演示配置类
 * 注入配置文件需使用@PropertySource指定文件地址
 *
 * @author Ping
 */
@Configurable
@ComponentScan("com.ping.spring.springboot.actualcombat.chapter2.el")
@PropertySource(value = "classpath:com/ping/spring/springboot/actualcombat/chapter2/el/test.properties", encoding = "UTF-8")
public class ElConfig {


    /**
     * 注入普通字符串
     */
    @Value("I Love You")
    private String normal;

    /**
     * 注入操作系统属性
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;

    /**
     * 注入表达式结果
     */
    @Value("#{T(Math).random() * 100.0}")
    private double randomNumber;

    //
    /**
     * 注入其他Bean的属性
     */
    @Value(value = "#{demoService.author}")
    private String formAnother;

    /**
     * 注入文件资源
     */
    @Value("classpath:/com/ping/spring/springboot/actualcombat/chapter2/el/Note.txt")
    private Resource testFile;

    /**
     * 注入网址资源
     */
    @Value("http://www.baidu.com")
    private Resource testUrl;

    /**
     * 使用配置文件属性用"$"
     */
    @Value("${project.name}")
    private String bookName;

    /**
     * 注入Properties还可以从Environment中获得
     */
    @Autowired
    private Environment environment;

    /**
     * 使用@Value注入，则要配置一个PropertySourcesPlaceholderConfigurer的Bean
     *
     * @return PropertySourcesPlaceholderConfigurer的Bean
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(formAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream(), StandardCharsets.UTF_8));
            System.out.println(IOUtils.toString(testUrl.getInputStream(), StandardCharsets.UTF_8));
            System.out.println(bookName);
            System.out.println(environment.getProperty("project.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
