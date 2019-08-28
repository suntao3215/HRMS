package com.sun.hrms.service.system;

import com.sun.hrms.bean.entity.system.User;

/**
 * Created by suntao on 2019/8/28
 */
public interface UserService {

    /**
     * 添加系统用户
     *
     * @param user 系统用户
     */
    void add(User user);
}
