import config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: MainTest
 * @Description: TODO
 * @Author ONESTAR
 * @Date: 2021/2/28 23:51
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestMain(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        // 工厂Bean获取的是getObject创建的对象
        Object factoryBean = applicationContext.getBean("colorFactoryBean");
        System.out.println("Bean的类型" + factoryBean.getClass());

        // 测试isSingleton控制单例多例
        Object factoryBean2 = applicationContext.getBean("colorFactoryBean");
        System.out.println("Bean的类型" + factoryBean.getClass());
        System.out.println(factoryBean == factoryBean2);

        // 通过加“&”获取ColorFactoryBean对象
        Object factoryBean3 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(factoryBean3.getClass());
    }
}
