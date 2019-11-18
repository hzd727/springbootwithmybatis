package com.mybatis.mybatistest.service;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public interface IBaseService<T> {

    List<T> selectAll();

    List<T> selectByExample(Example example);

    PageInfo<T> selectAllByPage(int pageNum,int pageSize);

    PageInfo<T> selectByExampleByPage(int pageNum,int pageSize,Example example);

    T selectByKey(T key);

    int save(T entity);

    int saveList(List<T> entity);

    int delete(T key);

    int updateAll(T entity);

    int updateNotNull(T entity);


}