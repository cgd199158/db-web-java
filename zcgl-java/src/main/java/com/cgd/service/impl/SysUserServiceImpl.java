package com.cgd.service.impl;

import com.cgd.entity.LoginBody;
import com.cgd.entity.SysUser;
import com.cgd.mapper.SysUserMapper;
import com.cgd.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2022-03-03
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser login(LoginBody loginBody){
        //根据接收的用户名和密码校验登录
        String username = loginBody.getUsername();
        System.out.println("username = " + username);
        SysUser sysUser =  sysUserMapper.getSysUserByUsername(username);
        System.out.println("sysUser = " + sysUser);
        if(null == sysUser) {
            System.out.println("直立式null");
        }
        return sysUser;
    }
}
