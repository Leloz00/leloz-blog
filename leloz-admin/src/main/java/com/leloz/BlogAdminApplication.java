package com.leloz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Swagger接口文档：http://localhost:8989/swagger-ui.html#/
/**
 * @Author Leloz
 */
@SpringBootApplication
@MapperScan("com.leloz.mapper")
public class BlogAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogAdminApplication.class, args);
    }
}
