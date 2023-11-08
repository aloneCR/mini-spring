package cn.dxx.springframework.beans.factory;

import cn.dxx.springframework.beans.BeansException;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
