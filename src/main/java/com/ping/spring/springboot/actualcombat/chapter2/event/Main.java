package com.ping.spring.springboot.actualcombat.chapter2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 *
 * @author Ping
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publisher("哈哈哈");

        context.close();

    }
}
