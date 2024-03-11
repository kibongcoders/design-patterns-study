package com.kibong.designpatternsstudy.behavioral_patterns.command.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.command.before.Game;

public class GameEndCommand implements Command {

    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    public void execute() {
        game.end();
    }
}
