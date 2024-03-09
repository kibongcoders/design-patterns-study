package com.kibong.designpatternsstudy.structural_patterns;

import com.kibong.designpatternsstudy.structural_patterns.flyweight.simple.Character;
import com.kibong.designpatternsstudy.structural_patterns.flyweight.simple.FontFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
public class FlyweightTest {

    @Test
    public void simpleFlyweightTest() {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("Nanum:12"));
        Character c2 = new Character('h', "white", fontFactory.getFont("Nanum:12"));
        Character c3 = new Character('h', "white", fontFactory.getFont("Nanum:12"));
        Character c4 = new Character('h', "white", fontFactory.getFont("Nanum:12"));

        log.info("c1 font: {}", c1.getFont());
        log.info("c2 font: {}", c2.getFont());
        log.info("c3 font: {}", c3.getFont());
        log.info("c4 font: {}", c4.getFont());

        assertAll(
                () -> assertEquals(c1.getFont(), c2.getFont()),
                () -> assertEquals(c2.getFont(), c3.getFont()),
                () -> assertEquals(c3.getFont(), c4.getFont()),
                () -> assertEquals(c1.getFont(), c4.getFont())
        );
    }
}
