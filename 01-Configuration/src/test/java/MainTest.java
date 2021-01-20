import com.onestar.config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: MainTest
 * @Description: @Configuration注解测试类
 * @Author ONESTAR
 * @Date: 2021/1/20 9:28
 * @QQ群：530311074
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestMain(){
        new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
