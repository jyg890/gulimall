package com.maxi.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.coupon.entity.SeckillSkuNoticeEntity;
import com.maxi.gulimall.coupon.utils.PageUtils;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-08 17:23:24
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

