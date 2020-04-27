package com.ping.spring.springboot.actualcombat.chapter3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchedulerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SchedulerConfig.class);
    }
}
