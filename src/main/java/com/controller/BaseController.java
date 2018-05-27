package com.controller;

import org.apache.commons.lang3.StringUtils;

import com.util.ReponseJson;
import com.util.ResultEnum;

public class BaseController {

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
