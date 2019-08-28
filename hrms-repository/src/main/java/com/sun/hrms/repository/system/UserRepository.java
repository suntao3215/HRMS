package com.sun.hrms.repository.system;

import com.sun.hrms.bean.entity.system.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by suntao on 2019/8/28
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
