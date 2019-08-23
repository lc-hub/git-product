package com.baizhi.service;

import com.baizhi.dao.UserDAo;
import com.baizhi.entity.User;

/**
 * @author miion
 * @create 2019-07-10 21:03
 */
public class UserServiceImpl implements UserService {

    private UserDAo userDAoo;
    @Override
    public void mofifySave(User user) {
          userDAoo.save(user);
    }

    public void setUserDAoo(UserDAo userDAoo) {
        this.userDAoo = userDAoo;
    }
}
