package com.study.cmall.user.service.impl;

import com.study.cmall.service.UserService;
import com.study.cmall.bean.UmsMember;
import com.study.cmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.study.cmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper usermapper;

    @Autowired
    UmsMemberReceiveAddressMapper UmsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsrMember = usermapper.selectAll();
        return umsrMember;
    }

}
