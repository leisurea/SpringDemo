package cn.kxgz.service.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import cn.kxgz.domain.Account;
import cn.kxgz.mapper.AccountMapper;
import cn.kxgz.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {

        accountMapper.save(account);

//        try {
//            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = build.openSession();
//            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//            mapper.save(account);
//            sqlSession.commit();
//            sqlSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
//        try {
//            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = build.openSession();
//            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//            List<Account> all = mapper.findAll();
//            sqlSession.close();
//            return all;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
    }
}
