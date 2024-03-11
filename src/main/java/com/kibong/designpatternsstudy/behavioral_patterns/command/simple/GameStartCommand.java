package com.kibong.designpatternsstudy.behavioral_patterns.command.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.command.before.Game;

public class GameStartCommand implements Command {

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    public void execute() {
        game.start();
    }
}
