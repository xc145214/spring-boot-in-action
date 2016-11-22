package com.xc.springMvc.controller;

import com.xc.springMvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/11/22.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/testRest",produces = "text/plain;charSet=UTF-8")
    public String testRest(){
        return demoService.saySomething();
    }


}
