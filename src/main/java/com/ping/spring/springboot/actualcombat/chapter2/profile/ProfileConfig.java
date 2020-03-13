package com.ping.spring.springboot.actualcombat.chapter2.profile;

import com.ping.spring.springboot.actualcombat.chapter1.aop.DemoMethodService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Profiles;

@Configuration
public class ProfileConfig {

    @Bean
    // Profile为dev时实例化devDemoBean
    @Profile("dev")
    public DemoBean demoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    // Profile为prod时实例化prodDemoBean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }
}
