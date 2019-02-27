package cn.battleheart.dubbo.spring.xml.customer;

import cn.battleheart.dubbo.spring.IUserService;
import cn.battleheart.dubbo.spring.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
