package cn.kxgz.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

import cn.kxgz.domain.Role;

public interface RoleMapper {

    @Select("select * from sys_user_role ur, sys_role r where ur.roleId = r.id and ur.userId = #{uid}")
    List<Role> findByRid(int uid);
}
