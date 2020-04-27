package com.ping.spring.springboot.actualcombat.chapter3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 通过@EnableScheduling注解开启计划任务的支持
 */
@Configuration
@ComponentScan("com.ping.spring.springboot.actualcombat.chapter3.taskscheduler")
@EnableScheduling
public class SchedulerConfig {

}
