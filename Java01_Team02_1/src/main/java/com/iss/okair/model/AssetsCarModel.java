package com.iss.okair.model;

public class AssetsCarModel {

	private String assetsCode;
	private String assetsType1;
	private String assetsType2;
	private String assetsNameCn;
	private String powerType;
	private String brandModel;
	private Boolean autoTrans;

	public String getAssetsNameCn() {
		return assetsNameCn;
	}
	public String getAssetsType1() {
		return assetsType1;
	}
	public void setAssetsType1(String assetsType1) {
		this.assetsType1 = assetsType1;
	}
	public String getAssetsType2() {
		return assetsType2;
	}
	public void setAssetsType2(String assetsType2) {
		this.assetsType2 = assetsType2;
	}
	public void setAssetsNameCn(String assetsNameCn) {
		this.assetsNameCn = assetsNameCn;
	}
	public String getPowerType() {
		return powerType;
	}
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}

	public Boolean getAutoTrans() {
		return autoTrans;
	}
	public void setAutoTrans(Boolean autoTrans) {
		this.autoTrans = autoTrans;
	}
	public String getAssetsCode() {
		return assetsCode;
	}
	public void setAssetsCode(String assetsCode) {
		this.assetsCode = assetsCode;
	}
	public String getBrandModel() {
		return brandModel;
	}
	public void setBrandModel(String brandModel) {
		this.brandModel = brandModel;
	}

	
}
