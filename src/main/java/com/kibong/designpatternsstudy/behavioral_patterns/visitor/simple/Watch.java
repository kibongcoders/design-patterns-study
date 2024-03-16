package com.kibong.designpatternsstudy.behavioral_patterns.visitor.simple;

public class Watch implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("print Circle to watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to Watch");
    }
}
