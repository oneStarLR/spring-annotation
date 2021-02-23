package com.onestar.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName: WindowsCondition
 * @Description: 判断操作系统是否是windows系统
 * @Author ONESTAR
 * @Date: 2021/2/10 10:53
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
public class WindowsCondition implements Condition {
    /**
     * @description TODO
     * @author ONESTAR
     * @date 2021/2/10 10:56
     * @param conditionContext:判断条件，能使用的上下问环境
     * @param annotatedTypeMetadata：注释信息
     * @throws
     * @return boolean
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 是否是Windows系统
        // 获取到IOC使用的beanFactory
        // ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        // 获取类加载器
        // ClassLoader classLoader = conditionContext.getClassLoader();
        // 获取当前环境
        Environment environment = conditionContext.getEnvironment();
        // 获取bean定义的注册类
        // BeanDefinitionRegistry registry = conditionContext.getRegistry();

        String property = environment.getProperty("os.name");
        if (property.contains("Windows")){
            return true;
        }
        return false;
    }
}
