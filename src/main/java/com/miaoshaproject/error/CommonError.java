package com.miaoshaproject.error;

/**
 * @author Sidney 2018-12-23.
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
