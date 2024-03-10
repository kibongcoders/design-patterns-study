package com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility;

import com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.simple.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChainOfResponsibilityTest {

    @Test
    public void ChainOfResponsibilityTest() {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
