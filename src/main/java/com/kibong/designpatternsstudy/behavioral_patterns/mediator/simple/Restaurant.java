package com.kibong.designpatternsstudy.behavioral_patterns.mediator.simple;

import java.time.LocalDateTime;

public class Restaurant {

    private FrontDesk frontDesk = new FrontDesk();

    public void reserveDinner(String id, LocalDateTime dinnerTime) {
        String roomNumber = frontDesk.getRomanNumber(id);
        System.out.println(roomNumber + "에 저녁식사를 예약했습니다.");
    }
}
