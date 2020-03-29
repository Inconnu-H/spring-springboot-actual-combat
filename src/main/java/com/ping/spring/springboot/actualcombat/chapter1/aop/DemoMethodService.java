package com.ping.spring.springboot.actualcombat.chapter1.aop;

import org.springframework.stereotype.Service;

/**
 * @author Ping
 */
@Service
public class DemoMethodService {

    public void add() {
        System.out.println("DemoMethodService.add()");
    }
}
