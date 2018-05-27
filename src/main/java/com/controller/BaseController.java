package com.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.util.ReponseJson;
import com.util.ResultEnum;

public class BaseController {

	protected Logger logger=LoggerFactory.getLogger(this.getClass());
	public ReponseJson returnResult(ResultEnum resultEnum) {
		return new ReponseJson(resultEnum.getCode(), resultEnum.getMsg());
	}
	public ReponseJson returnResult(ResultEnum resultEnum,String msg) {
		if(StringUtils.isNotBlank(msg)) {
			return new ReponseJson(resultEnum.getCode(), msg);
		}
		return new ReponseJson(resultEnum.getCode(), resultEnum.getMsg());
	}
	public ReponseJson returnResult(ResultEnum resultEnum,String msg,String result) {
		if(StringUtils.isNotBlank(result)) {
			if(StringUtils.isNotBlank(msg)) {
				return new ReponseJson(resultEnum.getCode(), msg, result);
			}else {
				return new ReponseJson(resultEnum.getCode(), resultEnum.getMsg(), result);
			}
		}
		if(StringUtils.isNotBlank(msg)) {
			return new ReponseJson(resultEnum.getCode(), msg);
		}else {
			return new ReponseJson(resultEnum.getCode(), resultEnum.getMsg());
		}
	}
	
}
