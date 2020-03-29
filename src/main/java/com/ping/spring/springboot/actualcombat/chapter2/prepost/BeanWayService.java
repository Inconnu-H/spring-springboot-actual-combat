package com.ping.spring.springboot.actualcombat.chapter2.prepost;

/**
 * 使用@Bean形式的Bean
 *
 * @author Ping
 */
public class BeanWayService {
    public BeanWayService() {
        super();
        System.out.println("初始化构造参数-BeanWayService");
    }

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
