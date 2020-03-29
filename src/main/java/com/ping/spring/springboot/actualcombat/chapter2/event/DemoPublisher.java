package com.ping.spring.springboot.actualcombat.chapter2.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * 事件发布类
 *
 * @author Ping
 */
@Component
public class DemoPublisher {

    /**
     * 注入ApplicationContext用来发布事件
     */
    final
    ApplicationEventPublisher publisher;

    public DemoPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publisher(String msg) {
        publisher.publishEvent(new DemoEvent(this, msg));
    }
}
