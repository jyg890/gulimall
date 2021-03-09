package com.maxi.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.coupon.entity.CouponEntity;
import com.maxi.gulimall.coupon.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-08 17:23:24
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

