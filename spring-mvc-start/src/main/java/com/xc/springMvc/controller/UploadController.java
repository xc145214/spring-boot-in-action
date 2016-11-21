package com.xc.springMvc.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by Administrator on 2016/11/21.
 */
@Controller
public class UploadController {


    @RequestMapping(value ="/upload",method = RequestMethod.POST)
    @ResponseBody
    public String upload(MultipartFile file){
        try {
            FileUtils.writeByteArrayToFile(new
                    File("e:/upload/"+file.getOriginalFilename())
                    ,file.getBytes());

            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "wrong";
        }
    }

}
