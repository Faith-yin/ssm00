package com.ypf.controller;

import com.ypf.util.TimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

//注解：该类下的所有方法都将返回json数据
@RestController
public class HelloWorld {

    //注解：用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World !";
    }

    @RequestMapping("/getMap")
    public Map<Object,String> getMap() {
        Map<Object,String> map = new HashMap<>();
        map.put("status", "200");
        map.put("result", "success");
        map.put("data", "Hello, ypf ...");
        return map;
    }


    private TimeFormat timeFormat;

    @RequestMapping("/dateToStamp")
    public String dateToStamp() {
        String res = null;
        try {
            res = timeFormat.dateToStamp("1996-09-13 12:23:01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return res;
    }

    @RequestMapping("/stampToDate")
    public String stampToDate() {
        String res = null;
        res = timeFormat.stampToDate("842588581000");
        return res;
    }

}














