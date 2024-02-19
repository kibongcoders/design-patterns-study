package com.kibong.designpatternsstudy.creational_patterns.factory_method.simple;

import com.kibong.designpatternsstudy.creational_patterns.factory_method.Ship;

public class BlackShip extends Ship {

    public BlackShip(){
        setName("blackship");
        setLogo("⚓");
        setColor("black");
    }
}
