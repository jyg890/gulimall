package com.maxi.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.coupon.entity.HomeSubjectEntity;
import com.maxi.gulimall.coupon.utils.PageUtils;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-08 17:23:24
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

