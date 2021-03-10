package com.maxi.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.member.entity.UndoLogEntity;
import com.maxi.gulimall.member.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-10 17:03:54
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

