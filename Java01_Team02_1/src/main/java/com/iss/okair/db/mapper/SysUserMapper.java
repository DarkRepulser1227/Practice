package com.iss.okair.db.mapper;

import java.util.List;

import com.iss.okair.db.entity.SysUser;

public interface SysUserMapper {
	//登陆的方法
	List<SysUser> loginCheck(SysUser user);
	//查找的方法
	List<SysUser> find(SysUser example);
	List<SysUser> selectByExample(SysUser example);
}
