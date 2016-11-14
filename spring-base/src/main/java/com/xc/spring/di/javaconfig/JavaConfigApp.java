package com.xc.spring.di.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2016/11/14.
 */
public class JavaConfigApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);

     UseFunctionService useFunctionService =
                context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("Java Config"));

        context.close();
    }
}
