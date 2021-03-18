package bean;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/17 19:04
 * @Version 1.0
 */
public class User {
    public User(){
        System.out.println("user-------------create");
    }

    public void init(){
        System.out.println("user-------------init");
    }

    public void destroy(){
        System.out.println("user-------------destroy");
    }
}