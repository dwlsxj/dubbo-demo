package cn.battleheart.dubbo.spring.xml.customer;

import cn.battleheart.dubbo.spring.IUserService;
import cn.battleheart.dubbo.spring.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

/**
 * 用户控制器。
 *
 * @author battleheart
 */
@RestController
public class UserController {

    @GetMapping(value = "getUserById")
    public User selectUser(Integer id) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        IUserService demoService = context.getBean("userService", IUserService.class);
        User hello = demoService.selectUser(1L);
        System.out.println("result: " + hello);
        return hello;
    }

    @GetMapping(value = "save")
    public Long save() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-consumer.xml"});
        context.start();

        IUserService iUserService = context.getBean("userService", IUserService.class);

        // Save Error
        try {
            User user = new User();
            iUserService.save(user);
            System.err.println("Validation Save ERROR");
        } catch (Exception e) {
            ConstraintViolationException ve = (ConstraintViolationException) e;
            Set<ConstraintViolation<?>> violations = ve.getConstraintViolations();
            System.out.println(violations);
        }
        return 2L;
    }
}
