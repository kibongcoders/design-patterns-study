package com.kibong.designpatternsstudy.behavioral_patterns.visitor.simple;

public class Triangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
