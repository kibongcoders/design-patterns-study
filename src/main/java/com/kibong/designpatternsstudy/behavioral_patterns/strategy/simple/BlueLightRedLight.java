package com.kibong.designpatternsstudy.behavioral_patterns.strategy.simple;

public class BlueLightRedLight {

    void blueLight(Speed speed) {
        speed.blueLight();
    }

    void redLight(Speed speed) {
        speed.redLight();
    }
}
