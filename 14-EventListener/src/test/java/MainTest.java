import config.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: MainTest
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/24 10:13
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestMain(){
        // 创建IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // 自己发布一个事件
        applicationContext.publishEvent(new ApplicationEvent("自己发布的事件") {
        });
        applicationContext.close();
    }
}