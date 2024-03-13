package com.kibong.designpatternsstudy.behavioral_patterns.memento.simple;

import lombok.Getter;

@Getter
public final class GameSave {

    private final int redTeamScore;
    private final int blueTeamScore;

    public GameSave(int redTeamScore, int blueTeamScore) {
        this.redTeamScore = redTeamScore;
        this.blueTeamScore = blueTeamScore;
    }
}
