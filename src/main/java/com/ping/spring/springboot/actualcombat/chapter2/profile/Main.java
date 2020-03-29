package com.ping.spring.springboot.actualcombat.chapter2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 *
 * @author Ping
 */
public class Main {

    public static void main(String[] args) {
        runDev();
        runProd();
    }

    static void runDev(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 先将活动的Profile设置为dev
        context.getEnvironment().setActiveProfiles("dev");
        // 后置注册Bean配置类，不然会报Bean未定义的错误
        context.register(ProfileConfig.class);
        // 刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }

    static void runProd(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
