package cn.kxgz.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//标志该类是spring的核心配置类
@Configuration
@ComponentScan("cn.kxgz")
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {


}
