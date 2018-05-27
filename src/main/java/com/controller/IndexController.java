package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entry.member.User;
import com.service.UserService;

@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService service;
    @RequestMapping
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/test",method = {RequestMethod.GET})
    public String test(Model model){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");

        User user=service.selectByUser("flyshy");
        logger.info(user.getPassword());

        long rq = System.currentTimeMillis();
        System.out.println(rq);
        model.addAttribute("rq", rq);
        return "test/test";
    }

    @ResponseBody
    @RequestMapping(value = "/testPost",method = {RequestMethod.POST})
    public String testpost(HttpServletRequest request){
        return request.getParameter("rq");
    }



    @RequestMapping("/403")
    public String forbidden(){
        return "403";
    }
	
}
