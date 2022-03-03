package com.cgd.controller;


import com.cgd.entity.SysUser;
import com.cgd.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2022-03-03
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;
    @GetMapping("/getUser")
    public SysUser getSysUser(){
        SysUser sysUser = sysUserService.getById(1);
        return sysUser;
    }
}
