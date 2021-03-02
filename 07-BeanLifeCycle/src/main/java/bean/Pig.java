package bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName: Pig
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/2 15:22
 * @Version 1.0
 */
@Component
public class Pig {
    public Pig(){
        System.out.println("pig create");
    }

    // @PostConstruct：对象创建并赋值之后调用
    @PostConstruct
    public void init(){
        System.out.println("pig postConstruct");
    }

    // @PreDestroy：容器移除对象之前
    @PreDestroy
    public void destroy(){
        System.out.println("pig destroy");
    }

}