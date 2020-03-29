package com.ping.spring.springboot.actualcombat.chapter2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 编写Prototype的Bean
 * 默认为Singleton，相当于@Scope("singleton")
 *
 * @author Ping
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
