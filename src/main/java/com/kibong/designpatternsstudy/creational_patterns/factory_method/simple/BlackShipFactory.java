package com.kibong.designpatternsstudy.creational_patterns.factory_method.simple;

import com.kibong.designpatternsstudy.creational_patterns.factory_method.Ship;
import com.kibong.designpatternsstudy.creational_patterns.factory_method.ShipFactory;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
