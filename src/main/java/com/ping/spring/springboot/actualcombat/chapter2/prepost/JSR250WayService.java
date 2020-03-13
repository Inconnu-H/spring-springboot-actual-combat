package com.ping.spring.springboot.actualcombat.chapter2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    public JSR250WayService() {
        super();
        System.out.println("初始化构造参数-JSR250WayService");
    }

    // @PostConstruct，在构造函数执行完之后执行
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    // @PreDestroy，在Bean销毁之前执行
    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }
}
