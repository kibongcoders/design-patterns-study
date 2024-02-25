package com.kibong.designpatternsstudy.creational_patterns.builder.example;

import lombok.Builder;

@Builder
public class LombokExample {

    //Lombok @Builder 에노테이션을 붙이는 것만으로도 해당 클래스를 빌더 패턴으로 만들 수 있다.

    private String title;

    private int nights;

    private int days;

    public static void main(String[] args) {
        LombokExample trip = LombokExample.builder()
                .title("여행")
                .nights(2)
                .days(3)
                .build();
    }

}
