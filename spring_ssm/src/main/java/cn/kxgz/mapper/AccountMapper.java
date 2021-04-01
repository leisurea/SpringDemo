package cn.kxgz.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

import cn.kxgz.domain.Account;

public interface AccountMapper {

    @Insert("insert into ssm2.account values(#{id},#{name},#{money})")
    void save(Account account);

    @Select("select * from ssm2.account")
    List<Account> findAll();

}
