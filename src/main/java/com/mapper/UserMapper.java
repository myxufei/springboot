package com.mapper;

import org.springframework.stereotype.Service;

import com.entry.member.User;
import com.util.CustomerMapper;

@Service
public interface UserMapper extends CustomerMapper<User>{


	public User selectByName(String userName);

}
