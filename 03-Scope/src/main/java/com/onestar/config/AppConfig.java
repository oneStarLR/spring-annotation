package com.onestar.config;

import com.onestar.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName: AppConfig
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/1/27 21:24
 * @Version 1.0
 */
@Configuration
public class AppConfig {
    // 默认是单例的
    @Bean
    @Scope("singleton")
    public User user(){
        return new User("ONESTAR",18);
    }
}