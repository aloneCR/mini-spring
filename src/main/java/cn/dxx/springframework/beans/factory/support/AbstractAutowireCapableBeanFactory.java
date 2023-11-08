package cn.dxx.springframework.beans.factory.support;

import cn.dxx.springframework.beans.BeansException;
import cn.dxx.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("创建Bean失败");
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
