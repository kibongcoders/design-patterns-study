package com.kibong.designpatternsstudy.creational_patterns.sigleton;

/**
 * 가장 간단하게 싱글톤 패턴을 완성하는 방법
 */
public class Settings1 {

    private static Settings1 instance;

    private Settings1() { }

    public static Settings1 getInstance() {

        if (instance == null) {
            instance = new Settings1();
        }

        return instance;
    }

}
