package com.maxi.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.maxi.gulimall.member.utils.PageUtils;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-10 17:03:55
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

