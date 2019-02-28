package com.iss.okair.controller.baseinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iss.okair.db.entity.Employee;
import com.iss.okair.db.entity.EmployeeDept;
import com.iss.okair.service.baseinfo.EmployeeService;



@RestController
@RequestMapping("/logic/baseInfo/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/deptList")
	public List<EmployeeDept> deptList(){
		return service.deptList();
	}
	@RequestMapping("/find")
	public List<Employee> find(Employee example){
		return service.selectByExample(example);
	}
	@RequestMapping("/list")
	public List<Employee> list() {
		return service.findAll();
	}
}
