package com.onestar.config;

import com.onestar.bean.User;
import com.onestar.condition.LinuxCondition;
import com.onestar.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: AppConfig
 * @Description: TODO
 * @Author ONESTAR
 * @Date: 2021/2/8 10:57
 * @URL：https://onestar.newstar.net.cn/
 * @微信：YXK-ONESTAR
 * @Version 1.0
 */
@Configuration
public class AppConfig {
    // 如果WindowsCondition的实现方法返回true，则注入这个bean
    @Conditional({WindowsCondition.class})
    @Bean
    public User user1(){
        return new User();
    }

    // 如果LinuxCondition的实现方法返回true，则注入这个bean
    @Conditional({LinuxCondition.class})
    @Bean
    public User user2(){
        return new User();
    }
}
