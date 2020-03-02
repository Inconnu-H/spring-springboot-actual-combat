package com.ping.spring.springboot.actualcombat.chapter1.javaconfig;

import org.springframework.stereotype.Service;

// 此处没有使用@Service声明Bean
public class FunctionService {

    public String sayHello(String word) {
        return word;
    }
}
