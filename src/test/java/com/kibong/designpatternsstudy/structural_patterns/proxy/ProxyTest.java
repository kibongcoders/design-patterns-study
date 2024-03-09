package com.kibong.designpatternsstudy.structural_patterns.proxy;

import com.kibong.designpatternsstudy.structural_patterns.proxy.simple.DefaultGameService;
import com.kibong.designpatternsstudy.structural_patterns.proxy.simple.GameService;
import com.kibong.designpatternsstudy.structural_patterns.proxy.simple.GameServiceProxy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProxyTest {

    @Test
    public void proxySimpleTest() {
        // Given
        GameService gameService = new GameServiceProxy(new DefaultGameService());

        // When
        gameService.startGame();

        // Then
    }
}
