package com.kibong.designpatternsstudy.behavioral_patterns.mediator.before;

public class Gym {

    private CleaningService cleaningService;

    public void clean() {
        cleaningService.clean(this);
    }
}
