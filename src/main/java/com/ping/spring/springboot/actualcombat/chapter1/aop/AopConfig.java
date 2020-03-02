package com.ping.spring.springboot.actualcombat.chapter1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ping.spring.springboot.actualcombat.chapter1.aop")
// 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ的支持
@EnableAspectJAutoProxy
public class AopConfig {
}
