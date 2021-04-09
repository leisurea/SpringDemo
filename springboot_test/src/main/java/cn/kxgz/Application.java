package cn.kxgz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * springboot 工程都有一个启动引导类，这是工程入口
 */
@SpringBootApplication
//@MapperScan(basePackages = "cn.kxgz.mapper")//扫描mybatis所有的mapper
@MapperScan("cn.kxgz.mapper")//通用mapper配置mybatis扫包路径
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
