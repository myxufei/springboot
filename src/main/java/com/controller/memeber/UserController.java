package com.controller.memeber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.controller.BaseController;
import com.util.ReponseJson;
import com.util.ResultEnum;
import com.util.ShiroUtil;

@Controller
@RequestMapping("/member")
public class UserController extends BaseController{


	@RequestMapping("/logout")
	@ResponseBody
	public ReponseJson logout() {
		try {
			ShiroUtil.logout();
			return returnResult(ResultEnum.SUCCESS);
		}catch (Exception e) {
			// TODO: handle exception
			return returnResult(ResultEnum.ERROR);
		}
	}
	
}
