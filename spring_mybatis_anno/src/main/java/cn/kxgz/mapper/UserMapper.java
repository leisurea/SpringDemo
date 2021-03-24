package cn.kxgz.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

import cn.kxgz.domain.User;

public interface UserMapper {

    @Insert("insert into sys_user values (#{id},#{username},#{emall},#{password},#{phoneNum})")
    void save(User user);

    @Update("update sys_user set username=#{username},password=#{password} where id=#{id}")
    void update(User user);

    @Delete("delete from sys_user where id=#{id}")
    void delete(int id);

    @Select("select * from sys_user wher id=#{id}")
    User findById(int id);

    @Select("select * from sys_user")
    List<User> findAll();

}
