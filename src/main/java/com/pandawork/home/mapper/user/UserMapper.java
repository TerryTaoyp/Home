package com.pandawork.home.mapper.user;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.home.common.entity.user.User;

/**
 * Created by Taoyongpan on 2017/4/20.
 */
public interface UserMapper {

    public void newUser(User user)throws SSException;
}
