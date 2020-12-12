package cn.kxgz.service.impl;

import cn.kxgz.dao.UserDao;
import cn.kxgz.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
