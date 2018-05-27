package com.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

public class ShiroUtil {
	public static Subject getSubject(){
		return SecurityUtils.getSubject();
	}
	/**
	 * ��½
	 * @param username
	 * @param password
	 * @param rememberMe
	 * @throws Exception
	 */
	public static void login(String username,String password,boolean rememberMe)throws Exception{
		UsernamePasswordToken token;
		if(rememberMe){
			token=new UsernamePasswordToken(username, password,rememberMe);
		}else{
			token=new UsernamePasswordToken(username, password);
		}
		getSubject().login(token);
	} 
	/**
	 * �˳�
	 * @throws Exception
	 */
	public static void logout()throws Exception{
		getSubject().logout();
	}
}
