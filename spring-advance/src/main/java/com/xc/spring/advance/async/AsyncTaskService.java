package com.xc.spring.advance.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/11/17.
 */
@Service
public class AsyncTaskService {

    public void execuAsyncTask(Integer i){
        System.out.println("执行异步任务："+ i);
    }

    /**
     * 如果定义在类上，该类的所有方法都是异步的。
     * @param i
     */
    @Async
    public void executeAsyncTaksPlus(Integer i){
        System.out.println("执行异步任务+1："+ (i+1));
    }
}
