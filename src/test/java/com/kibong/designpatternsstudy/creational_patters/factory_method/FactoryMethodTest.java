package com.kibong.designpatternsstudy.creational_patters.factory_method;

import com.kibong.designpatternsstudy.creational_patterns.factory_method.BlackShipFactory;
import com.kibong.designpatternsstudy.creational_patterns.factory_method.Ship;
import com.kibong.designpatternsstudy.creational_patterns.factory_method.WhiteShipFactory;
import com.kibong.designpatternsstudy.creational_patterns.factory_method.simple.ShipSimple;
import com.kibong.designpatternsstudy.creational_patterns.factory_method.simple.WhiteShipFactorySimple;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class FactoryMethodTest {

    @Test
    @DisplayName("간단한 팩토리 메서드 만들어보기 테스트")
    public void createSimpleFactoryMethodTest() {
        ShipSimple whiteship = new WhiteShipFactorySimple().orderShip("Whiteship", "kibong@test.com");
        log.info("ship={}", whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "kibong@test.com");
        log.info("ship={}", blackship);
    }
}
