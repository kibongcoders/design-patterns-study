package com.kibong.designpatternsstudy.behavioral_patterns.visitor.simple;

public interface Device {
    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
