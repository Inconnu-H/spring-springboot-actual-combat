package com.ping.spring.springboot.actualcombat.chapter1.di;

import org.springframework.stereotype.Service;

/**
 * 使用@Service注解声明当前FunctionService类是Spring管理的一个Bean。
 * 其中，使用@Component、@Sercie、@Repository和@Controller是等效的，可根据需要选用。
 *
 * @author Ping
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return word;
    }
}
