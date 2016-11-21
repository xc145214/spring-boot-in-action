package com.xc.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by Administrator on 2016/11/21.
 */
@Controller
public class SseController {

    @RequestMapping(value = "/push",produces = "text/event-stream")
    @ResponseBody
    public String push(){
        Random r = new Random();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "data:testing 1,2,3"+ r.nextInt()+"\n\n";
    }
}
