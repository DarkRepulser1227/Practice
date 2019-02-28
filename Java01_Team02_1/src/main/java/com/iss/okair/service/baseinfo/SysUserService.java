package com.iss.okair.service.baseinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.common.MD5Tools;
import com.iss.okair.db.entity.SysUser;
import com.iss.okair.db.entity.SysUserRole;
import com.iss.okair.db.mapper.SysUserMapper;
import com.iss.okair.db.mapper.SysUserRoleMapper;

@Service
public class SysUserService {
	
	@Autowired	//自动注入对象
	private SysUserMapper sysUserMapper;
	
	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;
	
	public SysUser login(SysUser loginUser) {
		loginUser.setPwd(MD5Tools.buildMD5String(loginUser.getPwd()));
		//加密后比对
		List<SysUser> result = sysUserMapper.loginCheck(loginUser);
		if(result.size() == 0) {
			return null;
		}else {
			return result.get(0);
		}
	}
	
	public List<SysUserRole> roleList(){
		return sysUserRoleMapper.selectAll();
	}
	
	public List<SysUser> selectByExample(SysUser example){
		return sysUserMapper.selectByExample(example);
	}
	
}
