package com.syu.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @version V1.0
 * @auther songyu@belink.com
 * @title
 * @description
 * @data 2023-06-04 15:38
 */
@Data
@NoArgsConstructor
@ToString
public class Result<T> {
    private Integer errorCode;

    private  String errorMsg;

    private boolean flag;

    private T data;

    public Result(Integer errorCode, String errorMsg, boolean flag) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.flag = flag;
    }

    public Result(Integer errorCode, String errorMsg, boolean flag, T data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.flag = flag;
        this.data = data;
    }
}
