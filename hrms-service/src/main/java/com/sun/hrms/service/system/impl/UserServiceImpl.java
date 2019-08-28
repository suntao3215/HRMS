package com.sun.hrms.service.system.impl;

import com.sun.hrms.bean.entity.system.User;
import com.sun.hrms.repository.system.UserRepository;
import com.sun.hrms.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by suntao on 2019/8/28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void add(User user) {
        userRepository.save(user);
    }
}
