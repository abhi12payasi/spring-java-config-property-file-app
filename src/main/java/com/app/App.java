package com.app;

import com.app.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ac.getBean("employee"));
    }
}

