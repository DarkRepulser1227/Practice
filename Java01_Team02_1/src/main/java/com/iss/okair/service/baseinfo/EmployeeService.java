package com.iss.okair.service.baseinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.okair.db.entity.Employee;
import com.iss.okair.db.entity.EmployeeDept;

import com.iss.okair.db.mapper.EmployeeDeptMapper;
import com.iss.okair.db.mapper.EmployeeMapper;



@Service
public class EmployeeService {
	@Autowired
	private EmployeeDeptMapper employeeDeptMapper;
	@Autowired	
	private EmployeeMapper employeeMapper;
	
	public List<EmployeeDept> deptList(){
		return employeeDeptMapper.selectAll();
	}
	public List<Employee> selectByExample(Employee example){
		return employeeMapper.selectByExample(example);
	}
	public List<Employee> findAll() {
		return employeeMapper.selectAll();
	}
}
