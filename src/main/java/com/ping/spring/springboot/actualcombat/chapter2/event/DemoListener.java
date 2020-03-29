package com.ping.spring.springboot.actualcombat.chapter2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 * 实现ApplicationListener接口，并指定监听的事件类型。
 *
 * @author Ping
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {


    /**
     * 使用onApplicationEvent方法对消息进行接受处理。
     *
     * @param demoEvent 自定义事件
     */
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息: " + msg);
    }
}
