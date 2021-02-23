package com.onestar.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName: LinuxCondition
 * @Description: 判断操作系统是否是Linux系统
 * @Author ONESTAR
 * @Date: 2021/2/10 10:54
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
public class LinuxCondition implements Condition {
    /**
     * @description 判断操作系统是否是Linux系统
     * @author ONESTAR
     * @date 2021/2/10 10:56
     * @param conditionContext
     * @param annotatedTypeMetadata
     * @throws
     * @return boolean
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        String property = environment.getProperty("os.name");
        if (property.contains("linux")){
            return true;
        }
        return false;
    }
}
