package com.maxi.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.order.entity.OrderSettingEntity;
import com.maxi.gulimall.order.utils.PageUtils;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-09 10:21:25
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

