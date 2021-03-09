package com.maxi.gulimall.product.dao;

import com.maxi.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author JYG
 * @email 765962377@qq.com
 * @date 2021-03-05 17:18:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
