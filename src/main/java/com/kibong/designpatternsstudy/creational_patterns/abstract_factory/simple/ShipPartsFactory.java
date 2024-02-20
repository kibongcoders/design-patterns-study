package com.kibong.designpatternsstudy.creational_patterns.abstract_factory.simple;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
