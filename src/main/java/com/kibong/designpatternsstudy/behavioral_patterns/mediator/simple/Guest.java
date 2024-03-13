package com.kibong.designpatternsstudy.behavioral_patterns.mediator.simple;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class Guest {

    @Setter
    @Getter
    private String id;
    private FrontDesk frontDesk = new FrontDesk();

    public void getTower(int numberOfTower) {
        frontDesk.getTower(this, numberOfTower);
    }

    public void dinner(LocalDateTime dinnerTime  ) {
        frontDesk.dinner(this, dinnerTime);
    }

}
