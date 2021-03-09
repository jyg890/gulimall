package com.maxi.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.order.entity.UndoLogEntity;
import com.maxi.gulimall.order.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-09 10:21:25
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

