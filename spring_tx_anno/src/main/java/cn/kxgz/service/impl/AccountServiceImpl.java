package cn.kxgz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.kxgz.dao.AccountDao;

@Service("accountService")
//@Transactional(isolation = Isolation.DEFAULT)
public class AccountServiceImpl implements cn.kxgz.service.AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)//就近原则
    @Override
    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan, money);
        int i = 1/0;
        accountDao.in(inMan, money);
    }
}
