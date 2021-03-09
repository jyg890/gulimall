package com.maxi.gulimall.product.gulimallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.maxi.gulimall.product.ProductMain;
import com.maxi.gulimall.product.entity.BrandEntity;
import com.maxi.gulimall.product.service.BrandService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = ProductMain.class)
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("hhhh");
        brandEntity.setName("huawei");
        System.out.println(brandService);
        brandService.save(brandEntity);

        System.out.println("success");

    }

}
