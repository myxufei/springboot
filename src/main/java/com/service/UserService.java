package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entry.member.User;
import com.mapper.UserMapper;
@Service
public class UserService {
	
	@Autowired
    UserMapper userMapper;
	public User selectByUser(String userName) {
		return userMapper.selectByName(userName);
	}
}
