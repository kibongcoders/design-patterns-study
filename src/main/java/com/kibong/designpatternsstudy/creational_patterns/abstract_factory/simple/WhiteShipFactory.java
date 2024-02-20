package com.kibong.designpatternsstudy.creational_patterns.abstract_factory.simple;

import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.before.*;

public class WhiteShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
