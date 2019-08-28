package com.sun.hrms.bean.entity.system;

import com.sun.hrms.bean.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by suntao on 2019/8/28
 */
@Entity
@Table(name = "sys_user")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Date birthday;

    @Column
    private Integer sex;

    @Column
    private String email;

    @Column
    private String phone;
}
