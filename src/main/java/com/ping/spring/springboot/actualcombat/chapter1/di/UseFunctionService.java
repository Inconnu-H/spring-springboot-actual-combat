package com.ping.spring.springboot.actualcombat.chapter1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 使用@Service注解声明当前FunctionService类是Spring管理的一个Bean。
@Service
public class UseFunctionService {

    // 使用@Autowired将FunctionService的实体Bean注入到UseFunctionService中，让UseFunction具备FunctionService的功能。
    // 此处使用JSR-330的@Inject注解或者JSR-250的@Resource注解是等效的。
    @Autowired
    FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
