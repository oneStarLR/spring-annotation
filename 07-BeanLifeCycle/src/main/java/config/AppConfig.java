package config;

import bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName: AppConfig
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/2 10:32
 * @Version 1.0
 */
@ComponentScan("bean")
@Configuration
public class AppConfig {
    @Scope("prototype")
    // 通过@Bean注解指定初始化和销毁方法
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Dog dog(){
        return new Dog();
    }
}