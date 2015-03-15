package com.hysd.domain;

import java.io.Serializable;

/**
 * 应答
 * 
 * @author 郑卫东
 * 
 */
public class ResultPO implements Serializable {

	private static final long serialVersionUID = 1865799445508071331L;
	
	/** 返回结果 */
	private String rs;
	/** 错误信息 */
	private String msg;
	
	public String getRs() {
		return rs;
	}

	public void setRs(String rs) {
		this.rs = rs;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void fail(String msg) {
		setMsg(msg);
		this.setRs("fail");
	}

	public void ok() {
		this.setRs("ok");
	}

}
