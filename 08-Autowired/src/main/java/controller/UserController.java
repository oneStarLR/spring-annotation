package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.UserService;

/**
 * @ClassName: DogController
 * @Description: TODO
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/10 17:14
 * @Version 1.0
 */
@Controller
public class UserController {

    @Autowired
    private UserService dogService;

}