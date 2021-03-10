package com.maxi.gulimall.member.dao;

import com.maxi.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-10 17:03:54
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
