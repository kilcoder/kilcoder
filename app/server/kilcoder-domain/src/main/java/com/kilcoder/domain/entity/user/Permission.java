package com.kilcoder.domain.entity.user;

import com.kilcoder.domain.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Permission extends BaseEntity {
    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限code
     */
    private String code;

    /**
     * 是否是系统权限
     */
    private Boolean isSys;

}
