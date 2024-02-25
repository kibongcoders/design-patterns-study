package com.kibong.designpatternsstudy.creational_patterns.builder.example;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    //UriComponentsBuilder를 통해서 조금 더 휴먼 에러를 줄이는 방법을 사용할 수 있다.
    //Spinrg에서 Builder가 붙은 것을 본다면 빌더 패턴을 사용한 것이라고 볼 수 있다.
    public static void main(String[] args) {
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .path("java playlist ep1")
                .build().encode();
        System.out.println(howToStudyJava);
    }
}
