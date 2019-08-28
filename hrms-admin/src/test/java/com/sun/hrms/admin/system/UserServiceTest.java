package com.sun.hrms.admin.system;

import com.sun.hrms.bean.entity.system.User;
import com.sun.hrms.service.system.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by suntao on 2019/8/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserAdd() {
        User user = new User();
        user.setName("鞠双元");
        user.setPhone("13884567890");
        userService.add(user);
    }
}
