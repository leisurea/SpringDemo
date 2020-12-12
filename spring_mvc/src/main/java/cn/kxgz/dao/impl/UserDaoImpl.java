package cn.kxgz.dao.impl;

import cn.kxgz.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save running...");
    }
}
