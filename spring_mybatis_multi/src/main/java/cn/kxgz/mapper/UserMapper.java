package cn.kxgz.mapper;

import java.util.List;

import cn.kxgz.domain.User;

public interface UserMapper {

    User findById(int id);
    List<User> findAll();
    List<User> findUserAndRoleAll();
}
