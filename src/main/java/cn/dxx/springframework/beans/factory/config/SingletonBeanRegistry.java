package cn.dxx.springframework.beans.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String name);
}
