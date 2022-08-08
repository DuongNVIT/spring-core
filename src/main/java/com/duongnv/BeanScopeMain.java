package com.duongnv;

import com.duongnv.config.AppConfig;
import com.duongnv.model.Computer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                context = new AnnotationConfigApplicationContext(AppConfig.class);
        Computer computer1 = context.getBean(Computer.class);
        Computer computer2 = context.getBean(Computer.class);

        System.out.println(computer1 == computer2); // return true
    }
}
