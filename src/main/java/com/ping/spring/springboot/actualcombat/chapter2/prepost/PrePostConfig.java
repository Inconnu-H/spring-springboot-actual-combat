package com.ping.spring.springboot.actualcombat.chapter2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ping.spring.springboot.actualcombat.chapter2.prepost")
public class PrePostConfig {

    // initMethod和destroyMethod指定BeanWayService类的init和destroy方法在构造之后和Bean销毁之前执行。
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    public JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
