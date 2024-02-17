package com.kibong.designpatternsstudy.creational_patterns.sigleton;

/**
 * synchronized 사용해서 동기화 처리
 */
public class Settings2 {

    private static final Settings2 INSTANCE = new Settings2();

    private Settings2() { }

// 가장 간단하게 멀티 쓰래드에서도 안전하게 하나의 인스턴스를 생성하는 방법
//    public static synchronized Settings2 getInstance() {
//        if (instance == null) {
//            instance = new Settings2();
//        }
//
//        return instance;
//    }

    public static synchronized Settings2 getInstance() {
        return INSTANCE;
    }

}
