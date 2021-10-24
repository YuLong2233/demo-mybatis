package com.example.demomybatis.service.impl;

import com.example.demomybatis.entity.UmsMember;
import com.example.demomybatis.mapper.UmsMemberMapper;
import com.example.demomybatis.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author YuLong
 * @since 2021-10-23
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService {

}
