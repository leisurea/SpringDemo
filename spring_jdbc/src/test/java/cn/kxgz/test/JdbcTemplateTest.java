package cn.kxgz.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class JdbcTemplateTest {

    @Test
    public void test1() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8");
        dataSource.setUser("root");
        dataSource.setPassword("12345678");

        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);

        int row = template.update("insert into account values (?,?)", "tom", 5000);
        System.out.println(row);

    }

    @Test
    public void test2() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = app.getBean(JdbcTemplate.class);
        int row = template.update("insert into account values (?,?)", "zhangsan", 4001);
        System.out.println(row);
    }
}
