package com.cgd.mapper;

import com.cgd.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2022-03-03
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    @Select("select * from sys_user where user_name = #{username}")
    public SysUser getSysUserByUsername(@Param("username") String username);
}
