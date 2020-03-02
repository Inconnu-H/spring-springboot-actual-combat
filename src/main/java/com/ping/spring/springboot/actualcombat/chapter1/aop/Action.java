package com.ping.spring.springboot.actualcombat.chapter1.aop;

import java.lang.annotation.*;

// 注解的作用目标
@Target(ElementType.METHOD)
// 注解的保留位置
@Retention(RetentionPolicy.RUNTIME)
// 说明该注解将被包含在javadoc中
@Documented
// 使用@interface定义一个注解类
public @interface Action {
    String name();
}
