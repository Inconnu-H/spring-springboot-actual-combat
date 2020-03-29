package com.ping.spring.springboot.actualcombat.chapter2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 需被注入的Bean
 *
 * @author Ping
 */
@Service
public class DemoService {


    /**
     * 此处为注入普通字符串
     */
    @Value("其他类的属性")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
