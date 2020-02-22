package com.ypf.service;

import com.ypf.entity.User;

import java.util.List;

public interface IUserService {

    //根据姓名查询信息
    List<User> findUserByName(String username);

    //显示所有信息
    List<User> showAllUser();

    //添加用户
    int addUser(User user);

    //删除用户
    int deleteUserByName(String username);

    //修改用户信息
    int updateUserByName(User user);

}
