package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author miion
 * @create 2019-07-10 21:21
 */
public class UserAction extends ActionSupport {
//
    private UserService userService;
// 接收注册的数据
    private User user;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String add(){
        System.out.println("hahahahhahaha "+user);
       userService.mofifySave(user);
        return "index";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
