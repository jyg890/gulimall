package com.maxi.gulimall.ware;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author JYG
 * @description
 * @create 2021β03-09 5:32 δΈε
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.maxi.gulimall.ware.dao")
public class WareMain {
    public static void main(String[] args){
        SpringApplication.run(WareMain.class,args);     
    }
}
