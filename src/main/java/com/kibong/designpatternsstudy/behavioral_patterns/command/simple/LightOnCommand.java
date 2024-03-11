package com.kibong.designpatternsstudy.behavioral_patterns.command.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.command.before.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
