package com.cgd.service;

import com.cgd.pojo.RespBean;
import com.cgd.pojo.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

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

    RespBean login(String username, String password);

    SysUser getSysUserByUserName(String username);
}
