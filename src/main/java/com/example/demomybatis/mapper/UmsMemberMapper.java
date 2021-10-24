package com.example.demomybatis.mapper;

import com.example.demomybatis.entity.UmsMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author YuLong
 * @since 2021-10-23
 */
@Mapper
public interface UmsMemberMapper extends BaseMapper<UmsMember> {

}
