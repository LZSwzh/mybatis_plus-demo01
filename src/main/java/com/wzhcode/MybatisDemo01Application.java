package com.wzhcode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzhCode.mapper")
public class MybatisDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDemo01Application.class, args);
    }

}
