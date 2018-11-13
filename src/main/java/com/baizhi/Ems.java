package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class Ems {
    public static void main(String[] args) {

        SpringApplication.run(Ems.class,args);
        System.out.println("aaaaaaaaaaaaaaa");
    }

}
