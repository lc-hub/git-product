package com.baizhi.test;

import com.baizhi.dao.UserDAo;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author miion
 * @create 2019-07-10 22:23
 */
public class TestService {
    @Test
    public void test() {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userDao = (UserService) ca.getBean("userService");
        userDao.mofifySave(new User(18, "lcc", "12345",12));
    }

}
