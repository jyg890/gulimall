package com.maxi.gulimall.order.dao;

import com.maxi.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-09 10:21:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
