package com.shiroproject.usershiroservice.utils;

import com.shiroproject.usershiroservice.entity.CommonResult;

import java.util.List;

public class SmallUtils {
    /**
     * 判断对象是否为空
     * @param o
     * @return
     */
    public static CommonResult getCommonResult(Object o){
        CommonResult commonResult = new CommonResult();
        if(o==null){
            commonResult.setCode(ConstantCode.ERROR_CODE);
            commonResult.setMessage(ConstantCode.ERROR_MESSAGE);
        }else{
            commonResult.setCode(ConstantCode.SUCCESS_CODE);
            commonResult.setMessage(ConstantCode.SUCCESS_MESSAGE);
        }
        return commonResult;
    }

    public static CommonResult getCommonResult(List l){
        CommonResult commonResult = new CommonResult();
        if(l==null){
            commonResult.setCode(ConstantCode.ERROR_CODE);
            commonResult.setMessage(ConstantCode.ERROR_MESSAGE);
        }else{
            commonResult.setCode(ConstantCode.SUCCESS_CODE);
            commonResult.setMessage(ConstantCode.SUCCESS_MESSAGE);
        }
        return commonResult;
    }
}
