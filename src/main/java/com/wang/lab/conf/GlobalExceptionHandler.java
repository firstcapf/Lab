package com.wang.lab.conf;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String allExceptionHandler(HttpServletRequest  request,Exception exception)
    {
        exception.printStackTrace();
        System.out.print("报错了："+exception.getMessage());
        return "网站建设中";
    }
}
