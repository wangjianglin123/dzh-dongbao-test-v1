package com.dzh.dongbao.common.base.result;

import com.dzh.dongbao.common.base.enums.StateCodeEnum;
import lombok.Builder;
import lombok.Data;
;
import java.io.Serializable;

@Data
@Builder
public class ResultWrapper<T> implements Serializable {
    //状态码
    private int code;

    //提示信息
    private String msg;

    private T data;

    /**
     * 返回成功的包装
     *
     * @return
     */
    public static ResultWrapper.ResultWrapperBuilder getSeccessBuilder() {
        return ResultWrapper.builder().code(StateCodeEnum.SUCCESS.getCode()).msg(StateCodeEnum.SUCCESS.getMsg());
    }

    /**
     * 返回失败的包装
     *
     * @return
     */
    public static ResultWrapper.ResultWrapperBuilder getFailBuilder() {
        return ResultWrapper.builder().code(StateCodeEnum.FAIL.getCode()).msg(StateCodeEnum.FAIL.getMsg());
    }
}
