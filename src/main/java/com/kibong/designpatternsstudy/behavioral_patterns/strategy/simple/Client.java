package com.kibong.designpatternsstudy.behavioral_patterns.strategy.simple;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight();

        blueLightRedLight.blueLight(new Normal());
        blueLightRedLight.redLight(new Normal());

        blueLightRedLight.blueLight(new Fast());
        blueLightRedLight.redLight(new Fast());
    }
}
