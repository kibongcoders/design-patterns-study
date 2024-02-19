package com.kibong.designpatternsstudy.creational_patterns.factory_method;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
