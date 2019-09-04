package com.study.cmall.user.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.study.cmall.bean.UmsMember;
import com.study.cmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){

        List<UmsMember> userMemberList= userService.getAllUser();

        return userMemberList;
    }


}
