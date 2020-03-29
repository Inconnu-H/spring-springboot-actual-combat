package com.ping.spring.springboot.actualcombat.chapter3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 任务执行类
 *
 * @author Ping
 */
@Service
public class AsyncTaskService {

    /**
     * 通过@Async注解表明该方法是个异步方法，如果注解在类级别，则表明该类所有的方法都是异步方法，而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor。
     *
     * @param i 用来输出
     */
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务: " + i);
    }

    @Async
    public void executeAsyncTaskSquare(Integer i) {
        System.out.println("执行异步任务的平方: " + Math.pow(i, 2));
    }
}
