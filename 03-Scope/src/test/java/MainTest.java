import com.onestar.config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: MainTest
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/1/26 16:40
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestMain(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : beanNames){
            System.out.println("容器中对象名称："+beanName);
        }

        Object user = applicationContext.getBean("user");
        Object user2 = applicationContext.getBean("user");
        System.out.println(user);
        System.out.println(user2);
        System.out.println(user == user2);

    }
}