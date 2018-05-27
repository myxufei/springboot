package com.util;

public enum ResultEnum {

	SUCCESS("ER001","成功"),
	ERROR("ER002","失败");
	private String msg;
	private String code;
	ResultEnum(String code,String msg){
		this.msg=msg;
		this.code=code;
	}
	public String getMsg() {
		return msg;
	}
	public String getCode() {
		return code;
	}
	
}
