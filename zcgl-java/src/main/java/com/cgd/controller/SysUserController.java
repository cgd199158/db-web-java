package com.cgd.controller;


import com.cgd.entity.LoginBody;
import com.cgd.entity.SysUser;
import com.cgd.service.ISysUserService;
import com.cgd.service.impl.SysUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2022-03-03
 */
@RestController
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;
    @GetMapping("/getUser")
    public SysUser getSysUser(){
        SysUser sysUser = sysUserService.getById(1);
        return sysUser;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginBody loginBody) throws Exception {
       SysUser sysUser =  sysUserService.login(loginBody);
       if(null == sysUser){
           return "没有当前用户!";
       }
       return sysUser.toString();
    }
}
