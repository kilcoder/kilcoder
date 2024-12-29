package com.kilcoder.domain.entity.user;

import com.kilcoder.domain.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Role extends BaseEntity {
    /**
     * 角色名称
     */
    private String name;

    /**
     * 归属机构
     */
    private Organization organization;

    /**
     * 权限
     */
    private List<Permission> permissions;
}
