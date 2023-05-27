package com.leloz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // 启用Swagger，访问网址的端口号为启动项目的端口号
public class SwaggerConfig {

    // 配置了Swagger的Docket的bean实例
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("后台文档")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.leloz.controller"))
                .build();
    }

    //配置Swagger信息=apiInfo
    private ApiInfo apiInfo() {
        // 作者信息
        Contact contact = new Contact("XCWL", "https://www.leloz.top", "jackieLvq@163.com");
        return new ApiInfoBuilder() //
                .title("LelozBlog的接口文档")
                .description("Swagger文档编写者：Leloz\n" +
                        "组长：chm\n" +
                        "前端组员：wjq，chm\n" +
                        "后端组员：Leloz，\n")
                .contact(contact)   // 联系方式
                .version("1.1.0")  // 版本
                .build();
    }

//    // 配置了Swagger的Docket的bean实例
//    @Bean
//    public Docket customDocket2() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("后台文档")
//                .apiInfo(apiInfo2())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.leloz.controller"))
////                .paths(PathSelectors.ant("/content/**"))
//                .build();
//    }
//
//    //配置Swagger信息=apiInfo
//    private ApiInfo apiInfo2() {
//        // 作者信息
//        Contact contact = new Contact("Leloz", "https://www.leloz.top", "jackieLvq@163.com");
//        return new ApiInfoBuilder() //
//                .title("LelozBlog后台后端接口文档")
//                .description("Swagger文档编写者：Leloz\n后台后端代码编写者：Leloz")
//                .contact(contact)   // 联系方式
//                .version("1.1.0")  // 版本
//                .build();
//    }
}