package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2021-05-14 10:17:21
 */
@Mapper
public interface CommentMapper extends BaseMapper<CommentEntity> {
	
}
