import config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @ClassName: MainTest
 * @Description: 启动测试类
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/15 16:41
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestMain() {
        // 创建IOC容器
        // AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("pro");
        // 注册主配置类
        applicationContext.register(AppConfig.class);
        // 启动刷新容器
        applicationContext.refresh();
        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String string : namesForType) {
            System.out.println(string);
        }
        // applicationContext.close();
    }
}