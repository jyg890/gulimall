package com.maxi.gulimall.coupon.gulimallcoupon;


import com.maxi.gulimall.coupon.CouponMain;
import com.maxi.gulimall.coupon.entity.HomeSubjectSpuEntity;
import com.maxi.gulimall.coupon.service.HomeSubjectSpuService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = CouponMain.class)
@RunWith(SpringRunner.class)
@Slf4j
public class GulimallCouponApplicationTests {

    @Resource
    HomeSubjectSpuService homeSubjectSpuService;
    @Test
    public void contextLoads() {

        HomeSubjectSpuEntity homeSubjectSpuEntity = new HomeSubjectSpuEntity();
        homeSubjectSpuEntity.setName("apple");
        homeSubjectSpuEntity.setSpuId(1L);

        homeSubjectSpuService.save(homeSubjectSpuEntity);
        log.info("success");

    }

}
