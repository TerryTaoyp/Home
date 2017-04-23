package com.pandawork.home.service.user.impl;

import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.home.common.entity.user.User;
import com.pandawork.home.service.user.UserService;
import com.pandawork.home.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/4/20.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    protected CommonDao commonDao;

    @Override
    public void newUser(User user) throws Exception {
        try{
            userMapper.newUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
