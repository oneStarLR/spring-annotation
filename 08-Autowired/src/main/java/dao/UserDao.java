package dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName: dog
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/10 17:13
 * @Version 1.0
 */
@Repository
public class UserDao {

    private String label = "1";

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "label='" + label + '\'' +
                '}';
    }
}