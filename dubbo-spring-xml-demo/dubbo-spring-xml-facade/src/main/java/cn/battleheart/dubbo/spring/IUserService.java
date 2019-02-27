package cn.battleheart.dubbo.spring;


import cn.battleheart.dubbo.spring.model.User;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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

    /**
     * 保存用户操作。
     *
     * @param user 用户信息。
     * @return 自增编号。
     */
    Long save(User user);

    /**
     * 根据用户编号删除用户信息。
     *
     * @param id       用户编号。
     * @param operator 操作人。
     * @return 返回受影响行数。
     */
    Integer delete(@Min(1) Long id, @NotNull @Size(min = 2, max = 16) @Pattern(regexp = "^[a-zA-Z]+$") String operator);
}
