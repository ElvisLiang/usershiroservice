package com.shiroproject.usershiroservice.controller;


import com.shiroproject.usershiroservice.entity.CommonResult;
import com.shiroproject.usershiroservice.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    ConsumerService consumerService;

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    @PostMapping("gainUser")
    public CommonResult gainUser(String username){
        return consumerService.selectUserByUsername(username);
    }

    /**
     * 获取用户角色
     * @param id
     * @return
     */
    @GetMapping("gainIdentity")
    public CommonResult gainIdentity(int id){
        return consumerService.SelectIdentityByUserId(id);
    }

    /**
     * 获取用户权限
     * @param id
     * @return
     */
    @PostMapping("gainAuthority")
    public CommonResult gainAuthority(int id){
        return consumerService.SelectAuthorityByUserId(id);
    }

    @GetMapping("test")
    public String test(){
        return "111111";
    }
}
