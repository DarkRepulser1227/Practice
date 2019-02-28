package com.iss.okair.model;

public class AssetsNormalModel {

	private String assetsCode;
	private String assetsType1;
	private String assetsType2;
	private String assetsNameCn;
	private String packageType;
	private String supplier;
	private Boolean consumptive;

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
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getAssetsCode() {
		return assetsCode;
	}
	public void setAssetsCode(String assetsCode) {
		this.assetsCode = assetsCode;
	}
	public Boolean getConsumptive() {
		return consumptive;
	}
	public void setConsumptive(Boolean consumptive) {
		this.consumptive = consumptive;
	}

	@Override
	public String toString() {
		return "AssetsNormalModel [assetsCode=" + assetsCode + ", assetsType1=" + assetsType1 + ", assetsType2="
				+ assetsType2 + ", assetsNameCn=" + assetsNameCn + ", packageType=" + packageType + ", supplier="
				+ supplier + ", consumptive=" + consumptive + "]";
	}

	
}
