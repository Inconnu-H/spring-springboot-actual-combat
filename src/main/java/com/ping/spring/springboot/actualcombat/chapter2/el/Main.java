package com.ping.spring.springboot.actualcombat.chapter2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().getClass().getResource("/").getPath());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig bean = context.getBean(ElConfig.class);
        bean.outputResource();
        context.close();
    }
}
