package com.xc.springMvc.controller;

import com.xc.springMvc.demain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/11/21.
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/converter",produces = "application/x-wisely")
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj demoObj){
        return demoObj;
    }
}
