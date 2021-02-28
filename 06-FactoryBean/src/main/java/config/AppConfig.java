package config;

import bean.ColorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: AppConfig
 * @Description: TODO
 * @Author ONESTAR
 * @Date: 2021/2/28 23:52
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
@Configuration
public class AppConfig {
    /**
     * 1.默认获取的是工厂Bean调用getObject创建的对象
     * 2.要获取工厂Bean本身，需要给ID前面加一个“&”
     */
    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
