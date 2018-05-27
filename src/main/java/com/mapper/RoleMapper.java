package com.mapper;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.entry.Role;
import com.util.CustomerMapper;
@Service
public interface RoleMapper extends CustomerMapper<Role> {
	Set<String> selectByUserName(String userName);
	Set<String> selectPermissionByUserName(String userName);
}