package com.hyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2015/12/16.
 */
@SpringBootApplication// same as @Configuration @EnableAutoConfiguration @ComponentScan
@ComponentScan(basePackages = "com.hyk")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
