package com.kibong.designpatternsstudy.behavioral_patterns.commnad;

import com.kibong.designpatternsstudy.behavioral_patterns.command.before.Light;
import com.kibong.designpatternsstudy.behavioral_patterns.command.simple.Button;
import com.kibong.designpatternsstudy.behavioral_patterns.command.simple.LightOnCommand;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommandTest {

    @Test
    public void helloTest() {

        Button button = new Button(new LightOnCommand(new Light()));
    }
}
