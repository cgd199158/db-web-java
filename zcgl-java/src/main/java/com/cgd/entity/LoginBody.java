package com.cgd.entity;

import lombok.Data;

@Data
public class LoginBody {
    //账号
    private String username;
    //密码
    private String password;
    //角色编号
    private String roleCode;
}
