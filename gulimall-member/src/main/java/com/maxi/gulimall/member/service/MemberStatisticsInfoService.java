package com.maxi.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.maxi.gulimall.member.utils.PageUtils;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-10 17:03:54
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

