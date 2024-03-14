package com.kibong.designpatternsstudy.behavioral_patterns.observer.simple;

import lombok.Getter;

import java.util.List;

public class User implements Subscriber{

    @Getter
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleMessage(String message) {
        System.out.println(name+" : "+message);
    }
}
