package com.shiroproject.usershiroservice.dao;

import com.shiroproject.usershiroservice.entity.Authority;

import java.util.List;

public interface AuthorityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);

    List<Authority> selectAuthorityByUserId(int id);
}