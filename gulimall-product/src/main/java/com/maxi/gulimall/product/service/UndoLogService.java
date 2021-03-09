package com.maxi.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.product.entity.UndoLogEntity;
import com.maxi.gulimall.product.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-05 17:18:14
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

