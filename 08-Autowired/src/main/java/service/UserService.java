package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DogService
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/10 17:14
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired(required = false)
    @Qualifier("userDao2")
    // @Resource(name = "userDao2",type = UserDao.class)
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}