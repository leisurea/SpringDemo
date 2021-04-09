package cn.kxgz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.kxgz.mapper.UserMapper;
import cn.kxgz.pojo.User;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void saveUser(User user) {
        System.out.println("新增用户");
        //选择性新增；如果类的某个属性为空则该属性不会出现在insert语句上
        userMapper.insertSelective(user);
    }

    public User queryWithRole(Long id){
        return userMapper.queryWithRole(id);
    }

}
