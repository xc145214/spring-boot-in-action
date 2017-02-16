package com.xc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */

@SpringBootApplication
public class ThymeleafApp {
    public static void main( String[] args ) {
        SpringApplication application = new SpringApplication(ThymeleafApp.class);
        application.run(args);
    }


}
