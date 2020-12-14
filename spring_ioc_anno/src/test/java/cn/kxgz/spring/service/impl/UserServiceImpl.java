package cn.kxgz.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import cn.kxgz.spring.dao.UserDao;
import cn.kxgz.spring.service.UserService;

@Service("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")
    private String driver;

    @Autowired
    @Qualifier("userDao")//依赖注入bean
//    @Resource(name = "userDao")//与上面两个等价
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    @PostConstruct//构造方法之后
    public void init(){
        System.out.println("service init");
    }

    @PreDestroy//销毁之前
    public void destroy(){
        System.out.println("service destroy");
    }
}
