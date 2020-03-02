package com.ping.spring.springboot.actualcombat.chapter1.javaconfig;

// 此处没有使用@Service声明Bean
public class UseFunctionService {

    // 此处没有使用Autowired注解注入Bean
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
