import config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: MainTest
 * @Description: 测试启动类
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/17 18:50
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestMain(){
        new AnnotationConfigApplicationContext(AppConfig.class);
    }
}