package com.ping.spring.springboot.actualcombat.chapter1.aop;

import org.springframework.stereotype.Service;

/**
 * @author Ping
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("DemoAnnotationService.Add()");
    }
}
