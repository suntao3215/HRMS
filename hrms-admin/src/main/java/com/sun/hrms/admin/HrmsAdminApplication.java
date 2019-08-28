package com.sun.hrms.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("com.sun.hrms")
public class HrmsAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmsAdminApplication.class, args);
    }

}
