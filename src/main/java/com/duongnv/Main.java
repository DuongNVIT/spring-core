package com.duongnv;

import com.duongnv.config.AppConfig;
import com.duongnv.model.Computer;
import com.duongnv.model.MediumMonitor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Computer computer = context.getBean(Computer.class);
        MediumMonitor mediumMonitor = context.getBean(MediumMonitor.class);
        computer.doSomething();
        mediumMonitor.turnOn();
    }
}
