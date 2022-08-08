package com.duongnv.model;

import org.springframework.stereotype.Component;

@Component
public class SmallMonitor implements Monitor{

    @Override
    public void turnOn() {
        System.out.println("Small monitor is turning on!");
    }
}
