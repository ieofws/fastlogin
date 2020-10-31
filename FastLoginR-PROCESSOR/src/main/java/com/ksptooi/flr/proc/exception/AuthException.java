package com.ksptooi.flr.proc.exception;

import com.ksptooi.util.dictionary.Excep;

public class AuthException extends java.lang.Exception {

    private String msg = "在验证时发生异常!";
    private Integer errorCode = -1;

    public AuthException(Excep status){
        this.msg = status.getMessage();
        this.errorCode = status.getErrorCode();
    }

    public AuthException(String msg){
        this.msg = msg;
    }

    public AuthException(){

    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }


}