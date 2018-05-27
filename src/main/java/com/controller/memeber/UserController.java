package com.controller.memeber;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.controller.BaseController;
import com.entry.member.User;
import com.util.ReponseJson;
import com.util.ResultEnum;
import com.util.ShiroUtil;

@Controller
@RequestMapping("/member")
public class UserController extends BaseController{




	
}
