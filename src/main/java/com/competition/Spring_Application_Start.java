package com.competition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.competition.mapper")
public class Spring_Application_Start {
    public static void main(String[] args) {
        SpringApplication.run(Spring_Application_Start.class,args);
    }
}
