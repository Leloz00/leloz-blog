package com.leloz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.leloz.mapper")
@EnableScheduling
public class LelozBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(LelozBlogApplication.class, args);      //启动类的参数字节码，列表
    }
}
