package com.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CustomerMapper<T> extends Mapper<T>,MySqlMapper<T>{

}
