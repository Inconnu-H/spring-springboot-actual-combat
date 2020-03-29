package com.ping.spring.springboot.actualcombat.chapter1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 使用@Configuration声明当前类是一个配置类
 * 使用@ComponentScan自动扫描包名下所有使用@Component、@Sercie、@Repository和@Controller的类，并注册为Bean
 *
 * @author Ping
 */
@Configuration
@ComponentScan("com.ping.spring.springboot.actualcombat.chapter1.di")
public class DiConfig {
}
