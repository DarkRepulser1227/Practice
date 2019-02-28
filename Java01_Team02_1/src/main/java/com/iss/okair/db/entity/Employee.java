package com.iss.okair.db.entity;

public class Employee {
	private Integer id;
	private String namecn;
	private String dept;
	private String empNo;
	private String reportTo;
	private String reportToName;
	public String getReportToName() {
		return reportToName;
	}
	public void setReportToName(String reportToName) {
		this.reportToName = reportToName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNamecn() {
		return namecn;
	}
	public void setNamecn(String namecn) {
		this.namecn = namecn;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getReportTo() {
		return reportTo;
	}
	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", namecn=" + namecn + ", dept=" + dept + ", empNo=" + empNo + ", reportTo="
				+ reportTo + "]";
	}
	
	
}
