package cn.kxgz.service;

import java.util.List;

import cn.kxgz.domain.Account;

public interface AccountService {

    void save(Account account);

    List<Account> findAll();

}
