package com.kibong.designpatternsstudy.creational_patterns.factory_method.simple;

public class BlackShipFactory implements ShipFactorySimple {

    @Override
    public ShipSimple createShip() {
        return new BlackShip();
    }
}
