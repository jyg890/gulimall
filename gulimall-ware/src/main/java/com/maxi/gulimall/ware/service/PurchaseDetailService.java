package com.maxi.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.ware.entity.PurchaseDetailEntity;
import com.maxi.gulimall.ware.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-09 17:28:49
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

