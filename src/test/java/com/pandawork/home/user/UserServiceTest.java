package com.pandawork.home.user;

import com.pandawork.home.AbstractTestCase;
import com.pandawork.home.common.entity.user.User;
import com.pandawork.home.service.user.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/4/20.
 */
public class UserServiceTest extends AbstractTestCase {
    @Autowired
    UserService userService;

    @Test
    public void testUser() throws Exception {
        User user  = new User();
//        user.setId(1);
        user.setUsername("tao");
        user.setPassword("tao");
        userService.newUser(user);
    }
}
