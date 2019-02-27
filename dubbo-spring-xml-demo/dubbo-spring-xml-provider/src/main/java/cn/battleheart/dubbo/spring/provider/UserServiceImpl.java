package cn.battleheart.dubbo.spring.provider;

import cn.battleheart.dubbo.spring.IUserService;
import cn.battleheart.dubbo.spring.model.User;

/**
 * 用户服务。
 *
 * @author battleheart
 */
public class UserServiceImpl implements IUserService {
    @Override
    public User selectUser(Long id) {
        User user = new User();
        user.setId(1L);
        user.setName("小丁");
        user.setPassword("123456");
        return user;
    }

    @Override
    public Long save(User user) {
        return 2L;
    }

    @Override
    public Integer delete(Long id) {
        return 1;
    }
}
