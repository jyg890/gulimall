package com.maxi.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.product.entity.AttrEntity;
import com.maxi.gulimall.product.utils.PageUtils;

import java.util.Map;

/**
 * 商品属性
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-05 17:18:14
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

