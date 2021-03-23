package listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyApplicationListener
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/23 8:58
 * @Version 1.0
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    // 当容器中发布此事件后，该方法会触发
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("收到的事件：" + applicationEvent);
    }
}