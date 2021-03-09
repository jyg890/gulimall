package com.maxi.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JYG
 * @description
 * @create 2021−03-08 4:39 下午
 */
@SpringBootApplication
@MapperScan("com.maxi.gulimall.product.dao")
public class ProductMain {
    public static void main(String[] args){
        SpringApplication.run(ProductMain.class,args);     
    }
}
