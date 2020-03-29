package com.ping.spring.springboot.actualcombat.chapter2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

    @Autowired
    ApplicationEventPublisher publisher;

    public void publisher(String msg){
        publisher.publishEvent(new DemoEvent(this, msg));
    }
}
