package com.xc.spring.advance.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2016/11/17.
 */
@Configuration
@ComponentScan("com.xc.spring.advance.schedule")
@EnableScheduling
public class TaskSchedulerConfig {
}
