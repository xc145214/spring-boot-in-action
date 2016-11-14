package com.xc.spring.di.anno;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/11/14.
 */
@Service
public class FunctionService {

    public String sayHello(String word){
        return "hello " + word + " !";
    }
}
