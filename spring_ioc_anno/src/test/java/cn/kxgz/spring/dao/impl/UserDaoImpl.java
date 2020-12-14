package cn.kxgz.spring.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import cn.kxgz.spring.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("save running ...");
    }
}
