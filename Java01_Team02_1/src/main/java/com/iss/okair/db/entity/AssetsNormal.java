package com.iss.okair.db.entity;

import java.util.Date;

public class AssetsNormal {
    private String id;

    private String assetscode;

    private Integer assetstype;

    private String namecn;

    private String normalbrand;

    private String normalmodel;

    private Integer packagetype;

    private String supplier;

    private String suppliertel;

    private boolean consumptive;

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

    public String getNormalbrand() {
        return normalbrand;
    }

    public void setNormalbrand(String normalbrand) {
        this.normalbrand = normalbrand == null ? null : normalbrand.trim();
    }

    public String getNormalmodel() {
        return normalmodel;
    }

    public void setNormalmodel(String normalmodel) {
        this.normalmodel = normalmodel == null ? null : normalmodel.trim();
    }

    public Integer getPackagetype() {
        return packagetype;
    }

    public void setPackagetype(Integer packagetype) {
        this.packagetype = packagetype;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getSuppliertel() {
        return suppliertel;
    }

    public void setSuppliertel(String suppliertel) {
        this.suppliertel = suppliertel == null ? null : suppliertel.trim();
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

	public boolean getConsumptive() {
		return consumptive;
	}

	public void setConsumptive(boolean consumptive) {
		this.consumptive = consumptive;
	}
}