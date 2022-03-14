package com.cgd.service;

import com.cgd.pojo.RespBean;
import com.cgd.pojo.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author cgd
 * @since 2022-03-05
 */
@Service
public interface ISysUserService extends IService<SysUser> {

    RespBean login(String username, String password, String code, HttpServletRequest request);

    SysUser getSysUserByUserName(String username);
}
