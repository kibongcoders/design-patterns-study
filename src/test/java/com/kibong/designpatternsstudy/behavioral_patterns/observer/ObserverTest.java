package com.kibong.designpatternsstudy.behavioral_patterns.observer;

import com.kibong.designpatternsstudy.behavioral_patterns.observer.example.ObserverInSpring;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ObserverTest {

    @Test
    public void observeTest(){
        SpringApplication app = new SpringApplication(ObserverInSpring.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run();
    }
}
