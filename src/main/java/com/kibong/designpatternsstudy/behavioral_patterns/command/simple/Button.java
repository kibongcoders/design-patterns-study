package com.kibong.designpatternsstudy.behavioral_patterns.command.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.command.before.Game;
import com.kibong.designpatternsstudy.behavioral_patterns.command.before.Light;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        Button button = new Button(new LightOnCommand(new Light()));
        button.press();
        Button buttonOff = new Button(new LightOffCommand(new Light()));
        buttonOff.press();
        Button buttonStart = new Button(new GameStartCommand(new Game()));
        buttonStart.press();
        Button buttonEnd = new Button(new GameEndCommand(new Game()));
        buttonEnd.press();

    }
}
