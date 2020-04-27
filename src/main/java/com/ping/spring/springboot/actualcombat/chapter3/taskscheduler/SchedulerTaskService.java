package com.ping.spring.springboot.actualcombat.chapter3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SchedulerTaskService {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    /**
     * 通过@Scheduled声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次：" + sdf.format(new Date()));
    }

    /**
     * 使用cron属性可按照执行时间执行，本例指的是每天11点01分执行；
     * cron是UNIX和类UNIX(Linux)系统下的定时任务。
     */
    @Scheduled(cron = "0 01 11 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定时间执行一次：" + sdf.format(new Date()));
    }
}
