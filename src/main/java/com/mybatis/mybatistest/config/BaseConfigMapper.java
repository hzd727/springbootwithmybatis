package com.mybatis.mybatistest.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface BaseConfigMapper<T> extends Mapper<T>, MySqlMapper<T> {
	
}