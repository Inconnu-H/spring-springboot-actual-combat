package com.ping.spring.springboot.actualcombat.chapter1.aop;

import java.lang.annotation.*;

/**
 * 使用@Targe表明注解的作用目标
 * 使用@Retention表明注解的保留位置
 * 使用@Documented表明说明该注解将被包含在javadoc中
 * 使用@interface定义一个注解类
 *
 * @author Ping
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
