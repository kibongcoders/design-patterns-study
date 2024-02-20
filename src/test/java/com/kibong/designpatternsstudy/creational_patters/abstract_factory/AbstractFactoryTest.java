package com.kibong.designpatternsstudy.creational_patters.abstract_factory;

import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.before.Ship;
import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.before.ShipFactory;
import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.simple.WhitePartsProFactory;
import com.kibong.designpatternsstudy.creational_patterns.abstract_factory.simple.WhiteShipFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AbstractFactoryTest {

    @Autowired
    Ship ship;

    @Test
    @DisplayName("추상 팩토리 패턴 테스트")
    public void abstractFactoryTest() {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }

    @Test
    @DisplayName("팩토리 빈 가져오기 테스트")
    public void factoryBeanTest() throws Exception {
        log.info("shipName={}", ship.getName());
    }
}
