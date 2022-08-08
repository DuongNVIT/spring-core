package com.duongnv.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Computer {

    @Autowired
    private Monitor monitor;

    public void doSomething() {
        System.out.println("Computer is doing something!");
    }
}
