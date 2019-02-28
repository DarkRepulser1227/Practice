package com.iss.okair.db.entity;

public class CateGory {
	private Integer id;
	private String code;
	private Integer parentId;
	private String nameCn;
	private String comment;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "CateGory [id=" + id + ", code=" + code + ", parentId=" + parentId + ", nameCn=" + nameCn + ", comment="
				+ comment + "]";
	}
	
}
