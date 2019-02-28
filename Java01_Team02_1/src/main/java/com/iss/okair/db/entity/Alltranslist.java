package com.iss.okair.db.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Alltranslist {
	private String id;
	private String assetsid;
	private String assetstype;
	private String batchno;
	private String transtype;
	private BigDecimal count;
	private BigDecimal price;
	private String handleremp;
	private String handlerempname;
	private Date instocktime;
	private String targetemp;
	private String targetempname;
	private String comment;
	private Date createtime;
	private String createuser;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAssetsid() {
		return assetsid;
	}
	public void setAssetsid(String assetsid) {
		this.assetsid = assetsid;
	}
	public String getAssetstype() {
		return assetstype;
	}
	public void setAssetstype(String assetstype) {
		this.assetstype = assetstype;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public String getTranstype() {
		return transtype;
	}
	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}
	public BigDecimal getCount() {
		return count;
	}
	public void setCount(BigDecimal count) {
		this.count = count;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getHandleremp() {
		return handleremp;
	}
	public void setHandleremp(String handleremp) {
		this.handleremp = handleremp;
	}
	public String getHandlerempname() {
		return handlerempname;
	}
	public void setHandlerempname(String handlerempname) {
		this.handlerempname = handlerempname;
	}
	public Date getInstocktime() {
		return instocktime;
	}
	public void setInstocktime(Date instocktime) {
		this.instocktime = instocktime;
	}
	public String getTargetemp() {
		return targetemp;
	}
	public void setTargetemp(String targetemp) {
		this.targetemp = targetemp;
	}
	public String getTargetempname() {
		return targetempname;
	}
	public void setTargetempname(String targetempname) {
		this.targetempname = targetempname;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getCreateuser() {
		return createuser;
	}
	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}
	
	
}
