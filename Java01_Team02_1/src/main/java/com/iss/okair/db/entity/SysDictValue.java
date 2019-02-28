package com.iss.okair.db.entity;

public class SysDictValue {
	private Integer id;
	private String typeCode;
	private String value;
	private String display;
	private String desc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "SysDicValue [id=" + id + ", typeCode=" + typeCode + ", value=" + value + ", display=" + display
				+ ", desc=" + desc + "]";
	}

		

	
		
}
