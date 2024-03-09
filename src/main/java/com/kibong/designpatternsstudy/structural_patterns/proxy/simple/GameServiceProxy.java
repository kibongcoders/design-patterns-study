package com.kibong.designpatternsstudy.structural_patterns.proxy.simple;

public class GameServiceProxy implements GameService {

    private DefaultGameService defaultGameService;

    public GameServiceProxy(DefaultGameService defaultGameService) {
        this.defaultGameService = new DefaultGameService();
    }

    public void startGame() {
        System.out.println("게임을 시작합니다.");
        long beforeTime = System.currentTimeMillis();
        this.defaultGameService.startGame();
        long afterTime = System.currentTimeMillis();
        System.out.println("게임을 종료합니다. 게임 시간: " + (afterTime - beforeTime) + "ms");
        System.out.println("게임을 종료합니다.");
    }
}
