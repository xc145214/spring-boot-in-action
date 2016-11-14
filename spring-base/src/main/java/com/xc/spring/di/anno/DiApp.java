package com.xc.spring.di.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2016/11/14.
 */
public class DiApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionService useFunctionService =
                context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("DI"));

        context.close();
    }
}
