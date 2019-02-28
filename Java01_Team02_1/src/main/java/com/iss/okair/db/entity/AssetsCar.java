package com.iss.okair.db.entity;

import java.util.Date;

public class AssetsCar {
	private String id;
	private String assetscode;
	private Integer assetstype;
	private String namecn;
	private String engineinfo;
	private String carbrand;
	private String carmodel;
	private String powertype;
	private Integer sitcount;
	private boolean autotrans;
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

	public String getNamecn() {
		return namecn;
	}

	public void setNamecn(String namecn) {
		this.namecn = namecn == null ? null : namecn.trim();
	}

	public String getEngineinfo() {
		return engineinfo;
	}

	public void setEngineinfo(String engineinfo) {
		this.engineinfo = engineinfo == null ? null : engineinfo.trim();
	}

	public String getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(String carbrand) {
		this.carbrand = carbrand == null ? null : carbrand.trim();
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel == null ? null : carmodel.trim();
	}

	public String getPowertype() {
		return powertype;
	}

	public void setPowertype(String powertype) {
		this.powertype = powertype == null ? null : powertype.trim();
	}

	public Integer getSitcount() {
		return sitcount;
	}

	public void setSitcount(Integer sitcount) {
		this.sitcount = sitcount;
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

	public boolean isAutotrans() {
		return autotrans;
	}

	public void setAutotrans(boolean autotrans) {
		this.autotrans = autotrans;
	}

	@Override
	public String toString() {
		return "AssetsCar [id=" + id + ", assetscode=" + assetscode + ", assetstype=" + assetstype + ", namecn="
				+ namecn + ", engineinfo=" + engineinfo + ", carbrand=" + carbrand + ", carmodel=" + carmodel
				+ ", powertype=" + powertype + ", sitcount=" + sitcount + ", autotrans=" + autotrans + ", createdate="
				+ createdate + ", createuser=" + createuser + ", comment=" + comment + "]";
	}

}
