package com.ping.spring.springboot.actualcombat.chapter2.event;

import org.springframework.context.ApplicationEvent;


/**
 * 自定义事件
 *
 * @author Ping
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
