package listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/24 10:34
 * @Version 1.0
 */
@Service
public class UserService {
    // 当容器中发布事件后，该方法会触发
    @EventListener(classes = {ApplicationEvent.class})
    public void listener1(ApplicationEvent event){
        System.out.println("监听到的事件1：" + event);
    }
    @EventListener(classes = {ApplicationEvent.class})
    public void listener2(ApplicationEvent event){
        System.out.println("监听到的事件2：" + event);
    }
}