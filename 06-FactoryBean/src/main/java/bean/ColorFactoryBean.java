package bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: ColorFactoryBean
 * @Description: TODO
 * @Author ONESTAR
 * @Date: 2021/3/1 0:10
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
// 创建一个spring定义的工厂Bean
public class ColorFactoryBean implements FactoryBean {
    // 返回一个color对象，这个对象会添加到容器中
    public Object getObject() throws Exception {
        return new Color();
    }

    // Bean的类型
    public Class<?> getObjectType() {
        return Color.class;
    }

    // 控制是否是单例，返回true为单例（容器中保存一份），返回false为多例（每次获取调用getObject()创建新的）
    public boolean isSingleton() {
        return true;
    }
}
