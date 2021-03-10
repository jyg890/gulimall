package com.maxi.gulimall.ware;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JYG
 * @description
 * @create 2021−03-09 5:32 下午
 */
@SpringBootApplication
@MapperScan("com.maxi.gulimall.ware.dao")
public class WareMain {
    public static void main(String[] args){
        SpringApplication.run(WareMain.class,args);     
    }
}
