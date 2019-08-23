package com.baizhi.test;

import com.baizhi.dao.UserDAo;
import com.baizhi.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author miion
 * @create 2019-07-10 20:54
 */
public class TestDAO {

    @Test
    public void test(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAo userDao = (UserDAo) ca.getBean("userDAo");
        User user = new User();
        user.setId(6);
        user.setUsername("haha");
        user.setPassword("12456");

        userDao.save(user);
    }

}
