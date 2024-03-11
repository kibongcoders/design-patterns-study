package com.kibong.designpatternsstudy.behavioral_patterns.command.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.command.before.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
