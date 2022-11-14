package com.dzh.dongbao.common.base.enums;


public enum StateCodeEnum {
    SUCCESS(200, "请求成功"),
    FAIL(500, "请求失败");


    private int code;
    private String msg;


    StateCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
