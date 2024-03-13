package com.kibong.designpatternsstudy.behavioral_patterns.mediator.simple;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    public void getTower(String id, int numberOfTower) {
        String romanNumber = frontDesk.getRomanNumber(id);
        System.out.println(romanNumber + "에 " + numberOfTower + "개의 타월을 받았습니다.");

    }
}
