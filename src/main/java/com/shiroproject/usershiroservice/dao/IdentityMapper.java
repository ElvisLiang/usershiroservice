package com.shiroproject.usershiroservice.dao;

import com.shiroproject.usershiroservice.entity.Identity;

public interface IdentityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Identity record);

    int insertSelective(Identity record);

    Identity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Identity record);

    int updateByPrimaryKey(Identity record);

    Identity selectIdentityByUserId(int id);
}