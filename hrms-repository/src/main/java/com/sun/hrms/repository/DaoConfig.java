package com.sun.hrms.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by suntao on 2019/8/28
 */
@Configuration
@EnableJpaRepositories("com.sun.hrms.repository")
public class DaoConfig {
}
