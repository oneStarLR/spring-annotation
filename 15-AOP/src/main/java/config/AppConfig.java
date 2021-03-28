package config;

import aspects.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import service.MathCalculator;

/**
 * @ClassName: AppConfig
 * @Description: TODO
 * @Author ONESTAR
 * @Date: 2021/3/28 18:03
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
@EnableAspectJAutoProxy
@Configuration
public class AppConfig {

    // 将业务逻辑类加入到容器中
    @Bean
    public MathCalculator calculator(){
        return new MathCalculator();
    }

    // 将切面类加入到容器中
    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
