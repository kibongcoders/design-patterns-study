package com.kibong.designpatternsstudy.creational_patterns.abstract_factory.simple;

import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.before.DefaultShipFactory;
import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.before.Ship;
import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.before.Whiteship;

public class WhiteShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
