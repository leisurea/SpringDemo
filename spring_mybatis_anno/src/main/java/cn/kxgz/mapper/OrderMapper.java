package cn.kxgz.mapper;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

import cn.kxgz.domain.Order;
import cn.kxgz.domain.User;

public interface OrderMapper {

    @Select("select * from test.orders where uid =#{uid}")
    List<Order> findByUId(int uid);

    @Select("select * from test.orders")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "ordertime", property = "ordertime"),
            @Result(column = "total", property = "total"),
            @Result(
                    property = "user",//类的属性名称
                    column = "uid",//根据哪个字段去查询user表的数据-外键
                    javaType = User.class,//瑶封装的尸体类型
                    //select属性，代表查询哪个接口的方法获得数据
                    one = @One(select = "cn.kxgz.mapper.UserMapper.findById")
            )

    })
    List<Order> findAll();

//
//    @Select("select *,o.id oid from test.orders o, test.sys_user u where u.id=o.uid")
//    @Results({
//            @Result(column = "oid", property = "id"),
//            @Result(column = "ordertime", property = "ordertime"),
//            @Result(column = "total", property = "total"),
//            @Result(column = "uid", property = "user.id"),
//            @Result(column = "username", property = "user.username"),
//            @Result(column = "emall", property = "user.emall"),
//            @Result(column = "phoneNum", property = "user.phoneNum"),
//            @Result(column = "password", property = "user.password")
//
//    })
//    List<Order> findAll();
//
//
}
