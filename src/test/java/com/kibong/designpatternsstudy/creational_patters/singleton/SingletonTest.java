package com.kibong.designpatternsstudy.creational_patters.singleton;

import com.kibong.designpatternsstudy.creational_patterns.sigleton.Settings;
import com.kibong.designpatternsstudy.creational_patterns.sigleton.Settings1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class SingletonTest {

    @Test
    @DisplayName("인스턴스가 다름 테스트")
    void instanceDifferentTest(){
        Settings settings = new Settings();
        Settings settings1 = new Settings();

        assertNotEquals(settings, settings1);
    }

    @Test
    @DisplayName("간단한 싱글톤 패턴 생성 테스트")
    void naiveSingletonPatternCreateTest(){
        Settings1 settings = Settings1.getInstance();
        Settings1 settings1 = Settings1.getInstance();

        assertEquals(settings, settings1);
    }
}
