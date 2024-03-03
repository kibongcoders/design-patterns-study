package com.kibong.designpatternsstudy.structural_patterns.bridge;

import com.kibong.designpatternsstudy.structural_patterns.bridge.before.Champion;
import com.kibong.designpatternsstudy.structural_patterns.bridge.simple.KDA;
import com.kibong.designpatternsstudy.structural_patterns.bridge.simple.PoolParty;
import com.kibong.designpatternsstudy.structural_patterns.bridge.simple.아리;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BridgePatternTest {

    @Test
    public void bridgePatternTest() {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillQ();
        poolParty아리.skillW();
    }
}
