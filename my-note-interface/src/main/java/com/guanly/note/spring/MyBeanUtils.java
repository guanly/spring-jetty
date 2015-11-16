package com.guanly.note.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by guanly on 2015/8/4.
 */
public class MyBeanUtils {
    private static BeanFactory context;

    public static void initBeanFactory(String... args) {
        context = new ClassPathXmlApplicationContext(args);
    }

    public static Object getBean(String beanId) {
        return context.getBean(beanId);
    }
}
