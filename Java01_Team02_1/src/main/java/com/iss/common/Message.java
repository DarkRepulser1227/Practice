package com.iss.common;

public class Message {

	private String msg;
	private boolean error;
	public boolean getError() {
		return error;
	}
	public boolean getSuccess() {
		return !error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
