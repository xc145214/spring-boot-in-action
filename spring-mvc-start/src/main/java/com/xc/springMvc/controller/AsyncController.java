package com.xc.springMvc.controller;

import com.xc.springMvc.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by Administrator on 2016/11/22.
 */
@Controller
public class AsyncController {

    @Autowired
    PushService pushService;

    @RequestMapping("/async")
    @ResponseBody
    public DeferredResult<String> deferredCall(){
        return pushService.getAsyncUpdate();
    }
}
