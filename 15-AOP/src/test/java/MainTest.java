import config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MathCalculator;

/**
 * @ClassName: MainTest
 * @Description: TODO
 * @Author ONESTAR
 * @Date: 2021/3/28 18:02
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestMain(){
        // 创建IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(2,0);

    }
}
