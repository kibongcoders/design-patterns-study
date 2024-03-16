package com.kibong.designpatternsstudy.behavioral_patterns.visitor.simple;

public class Phone implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("print Circle to phone");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to Phone");
    }
}
