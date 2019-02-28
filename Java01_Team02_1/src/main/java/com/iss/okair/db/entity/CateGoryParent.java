package com.iss.okair.db.entity;

public class CateGoryParent {
	private String nameCn;
	private Integer parentId;
	

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getNameCn() {
		return nameCn;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}
}
