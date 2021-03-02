import config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: MainTest
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/2 10:31
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestMain() {
        // 创建IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // String[] beanNames = applicationContext.getBeanDefinitionNames();
        // for (String beanName : beanNames) {
        //     System.out.println(beanName);
        // }
        // applicationContext.getBean("dog");
        applicationContext.close();
    }
}