package com.ping.spring.springboot.actualcombat.chapter2.profile;

/**
 * 示例Bean
 *
 * @author Ping
 */
public class DemoBean {
    private String content;

    public DemoBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
