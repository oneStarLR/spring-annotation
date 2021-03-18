package config;

import bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: AppConfig
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/18 17:03
 * @Version 1.0
 */
@Configuration
public class AppConfig {
    @Bean
    public User User(){
        return new User();
    }
}