package cn.kxgz.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import cn.kxgz.jdbc.domain.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCURDTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Test
    public void testQueryCount() {
        Long list = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println(list);
    }

    @Test
    public void testQueryOne() {
        Account list = jdbcTemplate.queryForObject("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class),"interesting");
        System.out.println(list);
    }

    @Test
    public void testQueryAll() {
        List<Account> list = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(list);
    }
    @Test
    public void testUpate() {
        jdbcTemplate.update("update account set money = ? where name=?", 10000, "interesting");
    }

    @Test
    public void testDelete(){
        jdbcTemplate.update("delete from account where name = ?","tom");
    }
}
