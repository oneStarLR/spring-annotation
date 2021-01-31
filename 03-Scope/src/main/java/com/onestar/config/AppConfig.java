package com.onestar.config;

import com.onestar.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
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
    // @Scope("prototype")：多实例，IOC容器启动的时候并不会创建对象放在容器中，每次获取的时候才会调用方法创建对象
    // @Scope("singleton")：单实例，IOC容器启动的时候就会调用方法创建对象放到容器中，以后每次获取都是从容器map中拿同一个对象
    // @Scope("request")：同一次请求创建一个实例
    // @Scope("session")：同一个session创建一个实例
    @Scope("singleton")
    @Bean
    @Lazy
    public User user(){
        return new User();
    }
}
