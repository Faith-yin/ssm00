package com.ypf.controller;

import com.ypf.entity.User;
import com.ypf.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *根据姓名查询信息
     */
    @ResponseBody
    @RequestMapping(value = "/findUserByName",method = RequestMethod.GET)
    private List<User> findUserByName(String username) {
        List<User> list = userService.findUserByName(username);
        return list;
    }

    /**
     * 显示所有信息
     */
    @ResponseBody
    @RequestMapping(value = "/showAllUser",method = RequestMethod.GET)
    private List<User> showAllUser() {
        List<User> list = userService.showAllUser();
        return list;
    }

    /**
     * 添加用户
     */
    @ResponseBody
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    private String addUser(User user) {
        int mark = userService.addUser(user);
        if(mark == -1) {
            return "添加失败";
        }else {
            return "添加成功";
        }
    }

    /**
     * 删除用户
     */
    @ResponseBody
    @RequestMapping(value = "/deleteUserByName",method = RequestMethod.DELETE)
    private String deleteUserByName(String username) {
        int mark = userService.deleteUserByName(username);
        if(mark == -1) {
            return "删除失败";
        }else {
            return "删除成功";
        }
    }

    /**
     * 修改用户信息
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserByName",method = RequestMethod.PUT)
    private String updateUserByName(User user) {
        int mark = userService.updateUserByName(user);
        if(mark == -1) {
            return "修改失败";
        }else {
            return "修改成功";
        }
    }



}
