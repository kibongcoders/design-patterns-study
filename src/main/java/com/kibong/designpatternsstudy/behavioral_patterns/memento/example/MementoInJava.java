package com.kibong.designpatternsstudy.behavioral_patterns.memento.example;


import com.kibong.designpatternsstudy.behavioral_patterns.memento.before.Game;

import java.io.*;

public class MementoInJava {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        try (
                FileOutputStream fileOut = new FileOutputStream("GameSave.hex");
                ObjectOutputStream out = new ObjectOutputStream(fileOut)
        ) {
            out.writeObject(game);
        }

        game.setBlueTeamScore(25);
        game.setRedTeamScore(15);

        // TODO 역직렬화
        try (FileInputStream fileIn = new FileInputStream("GameSave.hex");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            game = (Game) in.readObject();
            System.out.println(game.getBlueTeamScore());
            System.out.println(game.getRedTeamScore());
        }
    }
}
