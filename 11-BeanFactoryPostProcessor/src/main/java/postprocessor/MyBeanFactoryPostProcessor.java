package postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName: MyBeanFactoryPostProcessor
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/17 18:54
 * @Version 1.0
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor#postProcessBeanFactory");
        // 获取beanFactory中bean的个数
        int count = configurableListableBeanFactory.getBeanDefinitionCount();
        // 获取bean的名称
        String[] names = configurableListableBeanFactory.getBeanDefinitionNames();
        System.out.println("当前beanFactory中有" + count + "个bean");
        System.out.println("bean的名称：" + Arrays.asList(names));
    }
}