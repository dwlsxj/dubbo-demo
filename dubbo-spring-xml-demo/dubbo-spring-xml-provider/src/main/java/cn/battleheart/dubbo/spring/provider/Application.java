package cn.battleheart.dubbo.spring.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务提供者启动类。
 *
 * @author battleheart
 */
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();
        System.in.read();
    }
}
