package com.maxi.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author JYG
 * @description
 * @create 2021β03-08 4:39 δΈε
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.maxi.gulimall.product.dao")
public class ProductMain {
    public static void main(String[] args){
        SpringApplication.run(ProductMain.class,args);     
    }
}
