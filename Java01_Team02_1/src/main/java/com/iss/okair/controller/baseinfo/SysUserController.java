package com.iss.okair.controller.baseinfo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.iss.common.Message;
import com.iss.okair.db.entity.SysUser;
import com.iss.okair.db.entity.SysUserRole;
import com.iss.okair.service.baseinfo.SysUserService;


@RestController
@RequestMapping("/logic/baseInfo/sysUser")
@SessionAttributes("currentUser")
public class SysUserController {
	@Autowired
	private SysUserService service;
	
	@RequestMapping("/login")
	public Message login(HttpSession session, SysUser user,ModelMap modelMap) {
		Message msg = new Message();
		user = service.login(user);
		System.out.println("user=" + user);
		if(user != null) {
			msg.setError(false);
			msg.setMsg("/index");
			//将当前用户信息存入session
			modelMap.addAttribute("currentUser", user);
		}else {
			msg.setError(true);
			msg.setMsg("/login");
		}
		return msg;
	}
	@RequestMapping("/currentUser")
	public SysUser currentUser(ModelMap modelMap) {
		SysUser currentUser = (SysUser)(modelMap.get("currentUser"));
		return currentUser;
	}
	
	@RequestMapping("/roleList")
	public List<SysUserRole> roleList(){
		return service.roleList();
	}
	
	@RequestMapping("/find")
	public List<SysUser> find(SysUser example){
		return service.selectByExample(example);
	}
}
