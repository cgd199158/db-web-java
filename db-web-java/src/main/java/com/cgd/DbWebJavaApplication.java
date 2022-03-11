package com.cgd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.cgd.mapper")
// @ComponentScan(value = {"com.cgd.mapper"})
public class DbWebJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbWebJavaApplication.class, args);
    }

}
