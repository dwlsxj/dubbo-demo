package cn.battleheart.dubbo.spring;


import cn.battleheart.dubbo.spring.model.User;

/**
 * 用户接口。
 *
 * @author battleheart
 */
public interface IUserService {
    /**
     * 根据用户编号获取用户信息。
     *
     * @param id 用户编号。
     * @return 用户信息。
     */
    User selectUser(Long id);
}
