package com.cgd.service.impl;

import com.cgd.pojo.SysUser;
import com.cgd.mapper.SysUserMapper;
import com.cgd.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author cgd
 * @since 2022-03-05
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
