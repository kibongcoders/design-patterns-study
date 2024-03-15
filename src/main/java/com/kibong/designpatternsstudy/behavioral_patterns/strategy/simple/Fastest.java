package com.kibong.designpatternsstudy.behavioral_patterns.strategy.simple;

public class Fastest implements Speed {

    @Override
    public void blueLight() {
        System.out.println("무광꼬치");
    }

    @Override
    public void redLight() {
        System.out.println("피어씀다.");
    }
}
