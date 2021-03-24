package cn.kxgz.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import cn.kxgz.domain.User;
import cn.kxgz.mapper.UserMapper;

public class MyBatisTest {

    private UserMapper userMapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);//自动提交
        userMapper = sqlSession.getMapper(UserMapper.class);

    }

    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("xianger");
        user.setPassword("123456");
        user.setPhoneNum("12345678908");
        userMapper.save(user);
    }
    @Test
    public void delete() {
        userMapper.delete(5);
    }
}
