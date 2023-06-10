package com.syu.article.controller;

import com.syu.common.entity.Result;
import com.syu.common.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version V1.0
 * @auther songyu@belink.com
 * @title
 * @description
 * @data 2023-06-10 16:54
 */
@ControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return new Result(StatusCode.ERROR,e.getMessage(),false);
    }
}
