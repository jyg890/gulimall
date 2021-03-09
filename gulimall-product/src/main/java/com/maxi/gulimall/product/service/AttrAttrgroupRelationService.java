package com.maxi.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.maxi.gulimall.product.utils.PageUtils;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-05 17:18:14
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

