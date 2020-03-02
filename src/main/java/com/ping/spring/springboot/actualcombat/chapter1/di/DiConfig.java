package com.ping.spring.springboot.actualcombat.chapter1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Configuration声明当前类是一个配置类
@Configuration
// 使用ComponentScan，自动扫描包名下所有使用@Component、@Sercie、@Repository和@Controller的类，并注册为Bean
@ComponentScan("com.ping.spring.springboot.actualcombat.chapter1.di")
public class DiConfig {
}
