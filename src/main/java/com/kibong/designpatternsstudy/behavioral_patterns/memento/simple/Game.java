package com.kibong.designpatternsstudy.behavioral_patterns.memento.simple;

public class Game {

    private int redTeamScore;

    private int blueTeamScore;

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public void setRedTeamScore(int redTeamScore) {
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public void setBlueTeamScore(int blueTeamScore) {
        this.blueTeamScore = blueTeamScore;
    }

    public GameSave save() {
        return new GameSave(redTeamScore, blueTeamScore);
    }

    public void restore(GameSave gameSave) {
        this.redTeamScore = gameSave.getRedTeamScore();
        this.blueTeamScore = gameSave.getBlueTeamScore();
    }
}
