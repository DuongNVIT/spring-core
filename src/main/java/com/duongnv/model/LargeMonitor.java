package com.duongnv.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LargeMonitor implements Monitor{

    @Override
    public void turnOn() {
        System.out.println("Large monitor is turning on!");
    }
}
