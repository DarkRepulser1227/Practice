package com.iss.okair.db.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AssetsPermanent {
	private String id;
	private String assetscode;
	private Integer assetstype;
	private String city;
	private String address;
	private Integer scale;
	private String util;
	private BigDecimal area;
	private Integer equitytype;
	private String namecn;
	private Date createdate;
	private String createuser;
	private String comment;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getAssetscode() {
		return assetscode;
	}

	public void setAssetscode(String assetscode) {
		this.assetscode = assetscode == null ? null : assetscode.trim();
	}

	public Integer getAssetstype() {
		return assetstype;
	}

	public void setAssetstype(Integer assetstype) {
		this.assetstype = assetstype;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public Integer getScale() {
		return scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}

	public String getUtil() {
		return util;
	}

	public void setUtil(String util) {
		this.util = util == null ? null : util.trim();
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public Integer getEquitytype() {
		return equitytype;
	}

	public void setEquitytype(Integer equitytype) {
		this.equitytype = equitytype;
	}

	public String getNamecn() {
		return namecn;
	}

	public void setNamecn(String namecn) {
		this.namecn = namecn == null ? null : namecn.trim();
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getCreateuser() {
		return createuser;
	}

	public void setCreateuser(String createuser) {
		this.createuser = createuser == null ? null : createuser.trim();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}

	@Override
	public String toString() {
		return "AssetsPermanent [id=" + id + ", assetscode=" + assetscode + ", assetstype=" + assetstype + ", city="
				+ city + ", address=" + address + ", scale=" + scale + ", util=" + util + ", area=" + area
				+ ", equitytype=" + equitytype + ", namecn=" + namecn + ", createdate=" + createdate + ", createuser="
				+ createuser + ", comment=" + comment + "]";
	}
	
}
