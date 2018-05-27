package com.util;

public class ReponseJson {

	private String code;
	private String msg;
	private String result;
	
	public ReponseJson(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	public ReponseJson(String code, String msg, String result) {
		super();
		this.code = code;
		this.msg = msg;
		this.result = result;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
