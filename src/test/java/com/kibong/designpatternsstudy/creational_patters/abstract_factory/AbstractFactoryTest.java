package com.kibong.designpatternsstudy.creational_patters.abstract_factory;

import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.before.Ship;
import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.before.ShipFactory;
import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.simple.WhitePartsProFactory;
import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.simple.WhiteShipFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AbstractFactoryTest {

    @Test
    @DisplayName("추상 팩토리 패턴 테스트")
    public void abstractFactoryTest() {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
