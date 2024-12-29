package com.kilcoder.domain.entity.user;

import com.kilcoder.domain.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Organization extends BaseEntity {
    /**
     * 机构名
     */
    private String name;

    /**
     * 拥有者
     */
    private User owner;

    /**
     * 成员
     */
    private List<User> members;

    /**
     * 机构设置
     */
    private Map<String, Object> setting;
}
