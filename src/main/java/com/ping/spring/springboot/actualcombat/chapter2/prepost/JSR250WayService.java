package com.ping.spring.springboot.actualcombat.chapter2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 使用JSR250形式的Bean
 *
 * @author Ping
 */
public class JSR250WayService {

    public JSR250WayService() {
        super();
        System.out.println("初始化构造参数-JSR250WayService");
    }

    /**
     * 使用@PostConstruct表明在构造函数执行完之后执行
     */
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }


    /**
     * 使用@PreDestroy表明在Bean销毁之前执行
     */
    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }
}
