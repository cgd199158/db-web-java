package com.cgd.controller;

import com.cgd.pojo.LoginBody;
import com.cgd.pojo.RespBean;
import com.cgd.pojo.SysUser;
import com.cgd.service.ISysUserService;
import com.cgd.service.impl.SysUserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Api(tags = "LoginController")
@RestController
public class LoginController {

    @Autowired
    private ISysUserService sysUserService;

    @PostMapping("/login")
    @ApiOperation(value = "用户登录返回token")
    public RespBean login(@RequestBody LoginBody loginBody){
        return sysUserService.login(loginBody.getUsername(), loginBody.getPassword());
    }

    @ApiOperation(value = "获取当前用户信息")
    @GetMapping("/getUserInfo")
    public SysUser getAdminInfo(Principal principal) {
        if (null == principal) {
            return null;
        }
        String username = principal.getName();
        SysUser sysUser = sysUserService.getSysUserByUserName(username);
        sysUser.setPassword(null);
        return sysUser;
    }
}
