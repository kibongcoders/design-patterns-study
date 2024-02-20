package com.kibong.designpatternsstudy.creational_patterns.factory_method.example;

import com.kibong.designpatternsstudy.creational_patterns.factory_method.simple.BlackShipSimple;
import com.kibong.designpatternsstudy.creational_patterns.factory_method.simple.WhiteShipSimple;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShipSimple();
        } else if (name.equals("blackship")) {
            return new BlackShipSimple();
        }

        throw new IllegalArgumentException();
    }
}
