package config;

import bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: AppConfig
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/17 18:50
 * @Version 1.0
 */
@ComponentScan("postprocessor")
@Configuration
public class AppConfig {

    @Bean
    public User user(){
        return new User();
    }

}