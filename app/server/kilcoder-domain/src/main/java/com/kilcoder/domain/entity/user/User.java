package com.kilcoder.domain.entity.user;

import com.kilcoder.domain.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class User extends BaseEntity {

    private String id;

    private String name;

    private String password;

    private Map<String, Object> setting;
}
