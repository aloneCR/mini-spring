package cn.dxx.springframework;


import cn.dxx.springframework.bean.UserService;
import cn.dxx.springframework.beans.factory.BeanFactory;
import cn.dxx.springframework.beans.factory.config.BeanDefinition;
import cn.dxx.springframework.beans.factory.support.DefaultListableBeanFactory;

public class BeanFactoryTest {
    @org.junit.Test
    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("UserService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();

        UserService userService1 = (UserService) beanFactory.getBean("UserService");
        System.out.println(userService1 == userService);
    }
}
