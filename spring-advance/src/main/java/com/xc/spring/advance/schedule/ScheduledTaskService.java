package com.xc.spring.advance.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/17.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 每隔5秒执行一次。
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次： "+ dateFormat.format(new Date()));
    }

    /**
     * 指定时间执行。
     */
    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution(){
        System.out.println(" 在指定时间： "+ dateFormat.format(new Date()) + " 执行。");
    }
}
