package com.xc.spring.advance.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2016/11/17.
 */
public class AsyncApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService taskService = context.getBean(AsyncTaskService.class);

        for(int i =0;i<10;i++){
            taskService.execuAsyncTask(i);
            taskService.executeAsyncTaksPlus(i);
        }

        context.close();
    }
}
