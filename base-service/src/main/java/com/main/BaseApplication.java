package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableOpenApi   Swagger3.0.0使用
public class BaseApplication {
    public static void main( String[] args ) {
        SpringApplication.run(BaseApplication.class, args);
    }
}
