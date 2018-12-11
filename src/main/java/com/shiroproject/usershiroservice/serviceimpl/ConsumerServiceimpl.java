package com.shiroproject.usershiroservice.serviceimpl;

import com.shiroproject.usershiroservice.dao.AuthorityMapper;
import com.shiroproject.usershiroservice.dao.IdentityMapper;
import com.shiroproject.usershiroservice.dao.UserMapper;
import com.shiroproject.usershiroservice.entity.Authority;
import com.shiroproject.usershiroservice.entity.CommonResult;
import com.shiroproject.usershiroservice.entity.Identity;
import com.shiroproject.usershiroservice.entity.User;
import com.shiroproject.usershiroservice.service.ConsumerService;
import com.shiroproject.usershiroservice.utils.ConstantCode;
import com.shiroproject.usershiroservice.utils.SmallUtils;
import org.aspectj.apache.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerServiceimpl  implements ConsumerService{

    @Autowired
    AuthorityMapper authorityMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    IdentityMapper identityMapper;

    @Override
    public CommonResult selectUserByUsername(String username) {
        CommonResult commonResult = null;
        User user = userMapper.selectByUsername(username);
        commonResult = SmallUtils.getCommonResult(user);
        commonResult.setT(user);
        return commonResult;
    }

    @Override
    public CommonResult SelectIdentityByUserId(int id) {
        CommonResult commonResult = null;
        Identity identity = identityMapper.selectIdentityByUserId(id);
        commonResult = SmallUtils.getCommonResult(identity);
        commonResult.setT(identity);
        return commonResult;
    }

    @Override
    public CommonResult SelectAuthorityByUserId(int id) {
        CommonResult commonResult = null;
        List<Authority> authorities = authorityMapper.selectAuthorityByUserId(id);
        commonResult = SmallUtils.getCommonResult(authorities);
        commonResult.setLT(authorities);
        return  commonResult;
    }
}
