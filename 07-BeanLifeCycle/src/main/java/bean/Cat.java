package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Cat
 * @Description: 实现接口
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/2 14:56
 * @Version 1.0
 */
@Component
public class Cat implements InitializingBean, DisposableBean {
    public Cat(){
        System.out.println("cat create");
    }

    // 销毁Bean
    public void destroy() throws Exception {
        System.out.println("cat destroy");
    }

    // 初始化Bean
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet");
    }
}