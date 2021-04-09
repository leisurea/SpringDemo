package cn.kxgz.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import cn.kxgz.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void queryById() {
        User user = userService.queryById(2L);
        System.out.println(user);
    }

    @Test
    void saveUser() {
//        User user = new User();
//        user.setName("xianger");
//        user.setUserName("湘儿");
//        user.setPassword("123456");
//        user.setAge(28);
//        user.setCreated(new Date());
//        userService.saveUser(user);
//        System.out.println(user);
    }
}