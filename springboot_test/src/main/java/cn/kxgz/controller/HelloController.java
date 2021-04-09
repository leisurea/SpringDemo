package cn.kxgz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

import cn.kxgz.pojo.User;
import cn.kxgz.service.UserService;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;


    @GetMapping("hello")
    public String hello() {
        System.out.println("dataSource = "+dataSource);
        return "空虚公子";
    }

    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }
}
