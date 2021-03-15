package config;

import dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @ClassName: AppConfig
 * @Description: 配置类
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/10 16:43
 * @Version 1.0
 */
@Configuration
@ComponentScan({"dao","service","controller"})
public class AppConfig {

    @Primary
    @Bean("userDao2")
    public UserDao userDao(){
        UserDao userDao = new UserDao();
        userDao.setLabel("2");
        return userDao;
    }

}