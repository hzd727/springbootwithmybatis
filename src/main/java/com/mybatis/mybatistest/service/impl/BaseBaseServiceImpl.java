package com.mybatis.mybatistest.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.mybatistest.config.BaseConfigMapper;
import com.mybatis.mybatistest.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public abstract class BaseBaseServiceImpl<T> implements IBaseService<T> {

    @Autowired
    protected BaseConfigMapper<T> baseConfigMapper;

    public BaseConfigMapper<T> getBaseConfigMapper() {
        return baseConfigMapper;
    }
    
    @Override
    public List<T> selectAll() {
        //说明：查询所有数据
        return baseConfigMapper.selectAll();
    }

    @Override
    public List<T> selectByExample(Example example) {
        //说明：根据Example条件进行查询
        //重点：这个查询支持通过Example类指定查询列，通过selectProperties方法指定查询列
        return baseConfigMapper.selectByExample(example);
    }

    @Override
    public PageInfo<T> selectAllByPage(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<T> list = baseConfigMapper.selectAll();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        //说明：查询所有数据
        return pageInfo;
    }

    @Override
    public PageInfo<T> selectByExampleByPage(int pageNum,int pageSize,Example example) {
        //说明：根据Example条件进行查询
        //重点：这个查询支持通过Example类指定查询列，通过selectProperties方法指定查询列
        PageHelper.startPage(pageNum, pageSize);
        List<T> list = baseConfigMapper.selectByExample(example);
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        return pageInfo;
    }

    @Override
    public T selectByKey(T key) {
        //说明：根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
        return baseConfigMapper.selectByPrimaryKey(key);
    }
    
    @Override
    public int save(T entity) {
        //说明：保存一个实体，null的属性也会保存，不会使用数据库默认值
        return baseConfigMapper.insert(entity);
    }

    @Override
    public int saveList(List<T> entity) {
        //说明：保存一个实体，null的属性也会保存，不会使用数据库默认值
        return baseConfigMapper.insertList(entity);
    }
    
    @Override
    public int delete(T key) {
        //说明：根据主键字段进行删除，方法参数必须包含完整的主键属性
        return baseConfigMapper.deleteByPrimaryKey(key);
    }
    
    @Override
    public int updateAll(T entity) {
        //说明：根据主键更新实体全部字段，null值会被更新
        return baseConfigMapper.updateByPrimaryKey(entity);
    }
    
    @Override
    public int updateNotNull(T entity) {
        //根据主键更新属性不为null的值
        return baseConfigMapper.updateByPrimaryKeySelective(entity);
    }
    

}