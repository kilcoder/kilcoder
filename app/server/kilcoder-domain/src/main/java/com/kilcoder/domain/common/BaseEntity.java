package com.kilcoder.domain.common;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseEntity {
    /**
     * id
     */
    private String id;

    /**
     * 创建用户id
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createAt;

    /**
     * 更新用户id
     */
    private String updateBy;

    /**
     * 更新用户时间
     */
    private LocalDateTime updateAt;
}
