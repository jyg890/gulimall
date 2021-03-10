package com.maxi.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.maxi.gulimall.member.entity.MemberReceiveAddressEntity;
import com.maxi.gulimall.member.utils.PageUtils;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-10 17:03:54
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

