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
package com.xc.spring.config.life;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *  注解方式。
 *
 *  @author xiachuan at 2016/11/15 17:47。
 */

public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("JSR250 init method!");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("JSR250 destroy method!");
    }
}

