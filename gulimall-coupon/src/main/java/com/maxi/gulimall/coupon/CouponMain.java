package com.maxi.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author JYG
 * @description
 * @create 2021−03-09 9:59 上午
 */
@SpringBootApplication
@EnableDiscoveryClient//开启服务发现
@MapperScan("com.maxi.gulimall.coupon.dao")
public class CouponMain {
    public static void main(String[] args){
        SpringApplication.run(CouponMain.class,args);
    }
}
