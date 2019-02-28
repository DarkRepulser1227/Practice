package com.iss.okair.model;

public class AssetsFinanceModel {

	private String assetsCode;
	private String assetsType1;
	private String assetsType2;
	private String assetsNameCn;
	private String financeType;
	private String organization;
	private String refBankNo;
	private Boolean autoCycle;

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
	public String getAssetsCode() {
		return assetsCode;
	}
	public void setAssetsCode(String assetsCode) {
		this.assetsCode = assetsCode;
	}
	public String getFinanceType() {
		return financeType;
	}
	public void setFinanceType(String financeType) {
		this.financeType = financeType;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getRefBankNo() {
		return refBankNo;
	}
	public void setRefBankNo(String refBankNo) {
		this.refBankNo = refBankNo;
	}
	public Boolean getAutoCycle() {
		return autoCycle;
	}
	public void setAutoCycle(Boolean autoCycle) {
		this.autoCycle = autoCycle;
	}

	@Override
	public String toString() {
		return "AssetsFinanceModel [assetsCode=" + assetsCode + ", assetsType1=" + assetsType1 + ", assetsType2="
				+ assetsType2 + ", assetsNameCn=" + assetsNameCn + ", financeType=" + financeType + ", organization="
				+ organization + ", refBankNo=" + refBankNo + ", autoCycle=" + autoCycle + "]";
	}

}
