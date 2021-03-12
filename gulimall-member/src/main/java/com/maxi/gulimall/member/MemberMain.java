package com.maxi.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author JYG
 * @description
 * @create 2021−03-12 9:37 上午
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.maxi.gulimall.member.dao")
public class MemberMain {
    public static void main(String[] args){
        SpringApplication.run(MemberMain.class,args);
    }
}
