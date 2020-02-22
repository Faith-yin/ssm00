package com.ypf.service.impl;

import com.ypf.mapper.UserMapper;
import com.ypf.entity.User;
import com.ypf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据姓名查询信息
     */
    @Override
    public List<User> findUserByName(String username) {
        List<User> list = userMapper.findUserByName(username);
        return list;
    }

    /**
     * 显示所有信息
     */
    @Override
    public List<User> showAllUser() {
        List<User> list = userMapper.showAllUser();
        return list;
    }

    /**
     * 添加用户
     */
    @Override
    public int addUser(User user) {
        int mark = userMapper.addUser(user);
        return mark;
    }

    /**
     * 删除用户
     */
    @Override
    public int deleteUserByName(String username) {
        int mark = userMapper.deleteUserByName(username);
        return mark;
    }

    /**
     * 修改用户信息
     */
    @Override
    public int updateUserByName(User user) {
        int mark = userMapper.updateUserByName(user);
        return mark;
    }

}
