package com.ping.spring.springboot.actualcombat.chapter2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 *
 * @author Ping
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        context.getBean(BeanWayService.class);
        context.getBean(JSR250WayService.class);
        context.close();
    }
}
