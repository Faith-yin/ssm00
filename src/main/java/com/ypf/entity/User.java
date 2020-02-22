package com.ypf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *用户实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    //用户id
    private int id;
    //用户名称
    private String username;
    //用户年龄
    private int age;
    //用户学校
    private String school;
    //用户爱好
    private String hobby;
    //删除标志
    private int deleteFlag;


}
