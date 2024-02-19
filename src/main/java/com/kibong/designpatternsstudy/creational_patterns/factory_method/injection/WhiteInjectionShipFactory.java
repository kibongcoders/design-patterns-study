package com.kibong.designpatternsstudy.creational_patterns.factory_method.injection;

public class WhiteInjectionShipFactory extends DefaultShipFactory {
    @Override
    public InjectionShip createShip() {
        return new WhiteInjectionShip();
    }
}
