/**
 * **********************************************************************
 * HONGLING CAPITAL CONFIDENTIAL AND PROPRIETARY
 * <p>
 * COPYRIGHT (C) HONGLING CAPITAL CORPORATION 2012
 * ALL RIGHTS RESERVED BY HONGLING CAPITAL CORPORATION. THIS PROGRAM
 * MUST BE USED  SOLELY FOR THE PURPOSE FOR WHICH IT WAS FURNISHED BY
 * HONGLING CAPITAL CORPORATION. NO PART OF THIS PROGRAM MAY BE REPRODUCED
 * OR DISCLOSED TO OTHERS,IN ANY FORM, WITHOUT THE PRIOR WRITTEN
 * PERMISSION OF HONGLING CAPITAL CORPORATION. USE OF COPYRIGHT NOTICE
 * DOES NOT EVIDENCE PUBLICATION OF THE PROGRAM.
 * HONGLING CAPITAL CONFIDENTIAL AND PROPRIETARY
 * ***********************************************************************
 */
package com.xc.spring.di.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  main 类。
 *
 *  @author xiachuan at 2016/11/15 15:30。
 */

public class AopApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService =
                context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService =
                context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context.close();
    }
}

