package com.kibong.designpatternsstudy.structural_patterns.flyweight.example;

public class FlyweightInJava {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1.equals(i2));
    }
}
