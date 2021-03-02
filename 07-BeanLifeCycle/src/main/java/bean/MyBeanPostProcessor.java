package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyBeanPostProcessor
 * @Description: 后置处理器，初始化前后进行处理工作
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/2 16:32
 * @Version 1.0
 */
@Component      // 将后置处理器加入到容器中
public class MyBeanPostProcessor implements BeanPostProcessor {

    // postProcessBeforeInitialization：在初始化之前工作
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization" + beanName + "===" + bean);
        return bean;
    }

    // postProcessAfterInitialization：在初始化之后工作
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization" + beanName + "===" + bean);
        return bean;
    }
}