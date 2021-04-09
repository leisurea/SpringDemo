package cn.kxgz.mapper;


import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

import cn.kxgz.pojo.User;
import tk.mybatis.mapper.common.Mapper;

//@Mapper//太麻烦，每个都要写，在Application里直接扫码包即可
public interface UserMapper extends Mapper<User> {

    @Select("select * from sys_user")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "username", property = "username"),
            @Result(
                    property = "roles",
                    javaType = List.class,
                    column = "id",
                    many = @Many(select = "")

            )
    })
    User queryWithRole(Long id);

}
