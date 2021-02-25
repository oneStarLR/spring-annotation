package config;

import bean.User;
import importSelector.MyImportBeanDefinitionRegistrar;
import importSelector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName: AppConfig
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/2/25 14:44
 * @Version 1.0
 */
@Configuration
@Import({User.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})     //使用@Import导入组件，ID默认是组件的全类名
public class AppConfig {
}