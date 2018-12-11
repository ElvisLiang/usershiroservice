package com.shiroproject.usershiroservice.service;

import com.shiroproject.usershiroservice.entity.CommonResult;

public interface ConsumerService {
    /**
     * 查询用户信息
     * @param username
     * @return
     */
    CommonResult selectUserByUsername(String username);

    /**
     * 查询用户身份
     * @param id
     * @return
     */
    CommonResult SelectIdentityByUserId(int id);

    /**
     * 查询用户权限
     * @param id
     * @return
     */
    CommonResult SelectAuthorityByUserId(int id);
}
