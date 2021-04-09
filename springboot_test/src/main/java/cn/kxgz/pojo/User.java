package cn.kxgz.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

@Data
@Table(name = "tb_user")//映射的数据库表名
public class User {
    @Id//主键
    @KeySql(useGeneratedKeys = true)//主键回填，eg：新增时id插入成功后会赋值会实体类
    private Long id;
//    @Column(name = "userName")//默认名称与数据库名称大概一致可以不用加（驼峰，下划线规则已经适配）
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String note;
    private Date created;
    private Date updated;

    private List<Role> roles;

}
