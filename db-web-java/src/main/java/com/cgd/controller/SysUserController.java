package com.cgd.controller;


import com.cgd.config.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author cgd
 * @since 2022-03-05
 */
@RestController
public class SysUserController {

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @GetMapping("/test")
    public void test(){
    }



}
