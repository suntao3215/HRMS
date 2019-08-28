package com.sun.hrms.bean.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by suntao on 2019/8/28
 */
@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @CreatedDate
    @Column(name = "create_time", columnDefinition = "DATETIME COMMENT '创建时间/注册时间'")
    private Date createTime;

    @CreatedBy
    @Column(name = "create_by", columnDefinition = "VARCHAR(16) COMMENT '创建者'")
    private String createBy;

    @LastModifiedDate
    @Column(name = "modify_time", columnDefinition = "DATETIME COMMENT '最后更新时间'")
    private Date modifyTime;

    @LastModifiedBy
    @Column(name = "modify_by", columnDefinition = "VARCHAR(16) COMMENT '最后更新者'")
    private String modifyBy;
}
