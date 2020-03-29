package com.ping.spring.springboot.actualcombat.chapter2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 *
 * @author Ping
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.class.getResource("/").getPath());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig bean = context.getBean(ElConfig.class);
        bean.outputResource();
        context.close();
    }
}
