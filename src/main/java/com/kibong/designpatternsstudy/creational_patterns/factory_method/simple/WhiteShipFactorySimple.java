package com.kibong.designpatternsstudy.creational_patterns.factory_method.simple;

public class WhiteShipFactorySimple implements ShipFactorySimple {
    @Override
    public ShipSimple createShip() {
        return new WhiteShipSimple();
    }
}
