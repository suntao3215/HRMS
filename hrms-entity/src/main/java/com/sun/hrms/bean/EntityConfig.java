package com.sun.hrms.bean;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by suntao on 2019/8/28
 */
@Configuration
@EntityScan("com.sun.hrms.bean.entity")
public class EntityConfig {
}
