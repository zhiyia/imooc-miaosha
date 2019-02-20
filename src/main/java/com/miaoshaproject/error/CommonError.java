package com.miaoshaproject.error;

/**
 * @author :zx
 * @description:TODO
 * @date :2019/1/7
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
