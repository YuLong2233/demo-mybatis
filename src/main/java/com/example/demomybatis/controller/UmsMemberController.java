package com.example.demomybatis.controller;


import com.example.demomybatis.entity.UmsMember;
import com.example.demomybatis.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author YuLong
 * @since 2021-10-23
 */
@RestController
@RequestMapping("/ums-member")
public class UmsMemberController {

    @Autowired
    UmsMemberService umsMemberService;


    @GetMapping("/testInsert")
    public void testInsert() {
//        UmsMember t = new UmsMember();
//        t.setIcon("1");
//        t.setUsername("小明");
//        t.setPassword("123456");
//        t.setStatus(0);
//        t.setNote("note");
//        t.setEmail("email");
//        t.setNickName("nick");
//        Boolean b = umsMemberService.save(t);
//        if (b) {
//            System.out.println("成功");
//        } else {
//            System.out.println("失败");
//        }

        List<UmsMember> list =umsMemberService.list();

        for (UmsMember umsMember : list) {
           // System.out.println("名稱 ："+umsMember.getUsername());
            if (umsMember.getUsername().equals("张三")){
                System.out.println("张三已经报名了");
            }else{
                System.out.println("张三没有报名");
            }
        }


//        list.forEach(e->{
//            System.out.println("名稱："+e.getUsername());
//        });
       // list.stream().filter(e->(e.getUsername().equals("小明"))).findAny().orElse(null);


    }


}

