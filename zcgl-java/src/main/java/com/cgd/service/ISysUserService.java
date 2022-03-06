package com.cgd.service;

import com.cgd.entity.LoginBody;
import com.cgd.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.catalina.User;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2022-03-03
 */
public interface ISysUserService extends IService<SysUser> {
    SysUser login(LoginBody loginBody);
}
