package com.kibong.designpatternsstudy.behavioral_patterns.mediator.simple;

import java.time.LocalDateTime;

public class FrontDesk {

    CleaningService cleaningService = new CleaningService();
    Restaurant restaurant = new Restaurant();

    public void getTower(Guest guest, int numberOfTower) {
        cleaningService.getTower(guest.getId(), numberOfTower);
    }

    public String getRomanNumber(String id) {
        return "123호";
    }

    public void dinner(Guest guest, LocalDateTime dinnerTime) {
        restaurant.reserveDinner(guest.getId(), dinnerTime);
    }
}
