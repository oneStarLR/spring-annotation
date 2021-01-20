package com.onestar.config;

import com.onestar.bean.User;
import com.onestar.bean.User2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: AppConfig
 * @Description: spring配置类，相当于配置文件
 * @Author ONESTAR
 * @Date: 2021/1/11 16:22
 * @QQ群：530311074
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
// @Configuration注解告诉spring这是一个配置类
@Configuration
@ComponentScan(value = "com.onestar")
public class AppConfig {
    // @bean注解给容器注册bean，也就是xml中的bean标签，id默认是方法名，可以用value指定id，获取到的实例对象都是单实例的
    @Bean
    public User user(){
        return new User();
    }

    @Bean
    public User2 user2() {
        user();
        return new User2();
    }
}
