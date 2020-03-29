package com.ping.spring.springboot.actualcombat.chapter2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 配置类
 *
 * @author Ping
 */
@Configuration
public class ProfileConfig {

    /**
     * Profile为dev时实例化devDemoBean
     *
     * @return 返回开发环境示例Bean
     */
    @Bean
    @Profile("dev")
    public DemoBean demoBean() {
        return new DemoBean("from development profile");
    }

    /**
     * Profile为prod时实例化prodDemoBean
     *
     * @return 返回生产环境示例Bean
     */
    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("from production profile");
    }
}
