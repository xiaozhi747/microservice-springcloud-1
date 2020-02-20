package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author GongXings
 * @createTime 30 15:14
 * @description
 */
@SpringBootApplication
//本服务启动后会自动注册进eureka服务
//@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient
public class DeptProvider8001App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001App.class,args);
    }
}