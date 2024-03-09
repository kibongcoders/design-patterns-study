package com.kibong.designpatternsstudy.structural_patterns.proxy.simple;

public class DefaultGameService implements GameService{

    public void startGame() {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
