package cn.battleheart.dubbo.spring.provider;

import cn.battleheart.dubbo.spring.IUserService;
import cn.battleheart.dubbo.spring.model.User;

public class UserServiceImpl implements IUserService {
    @Override
    public User selectUser(Long id) {
        User user = new User();
        user.setId(1L);
        user.setName("小丁");
        user.setPassword("123456");
        return user;
    }
}
