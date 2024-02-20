package com.kibong.designpatternsstudy.creational_patterns.abstract_factory.example;

import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.before.Whiteship;
import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.before.Ship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
