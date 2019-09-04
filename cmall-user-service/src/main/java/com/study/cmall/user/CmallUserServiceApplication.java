package com.study.cmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.study.cmall.user.mapper")
public class CmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmallUserServiceApplication.class, args);
    }

}
