package com.cgd.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 用户登录实体类
 */

@Data
// @EqualsAndHashCode(callSuper = false)
// @Accessors(chain = true)
public class LoginBody {
    private String username;
    private String password;
}
