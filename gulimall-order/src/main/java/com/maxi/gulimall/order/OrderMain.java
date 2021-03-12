package com.maxi.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author JYG
 * @description
 * @create 2021−03-09 10:23 上午
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.maxi.gulimall.order.dao")
public class OrderMain {
    public static void main(String[] args){
        SpringApplication.run(OrderMain.class,args);
    }
}
