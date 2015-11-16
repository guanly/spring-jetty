package com.guanly.note.web.beancommon;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by guanly on 2015/10/22.
 */
public class ContextUtils {
    private static ClassPathXmlApplicationContext context;

    public static void initBean() {
        context = new ClassPathXmlApplicationContext("spring-jetty.xml");
    }

    public static Object getBean(String beanId) {
        return context.getBean(beanId);
    }
}
