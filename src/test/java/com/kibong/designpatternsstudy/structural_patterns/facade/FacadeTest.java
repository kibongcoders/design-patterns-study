package com.kibong.designpatternsstudy.structural_patterns.facade;

import com.kibong.designpatternsstudy.structural_patterns.facade.simple.EmailMessage;
import com.kibong.designpatternsstudy.structural_patterns.facade.simple.EmailSender;
import com.kibong.designpatternsstudy.structural_patterns.facade.simple.EmailSettings;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FacadeTest {

    public void facadeTest() {
        // EmailMessage, EmailSettings, EmailFacade를 사용하여 이메일을 보내는 코드
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTo("keesun@whiteship.me");
        emailMessage.setFrom("whiteship@whiteship.me");
        emailMessage.setSubject("Test Mail from Java Program");
        emailMessage.setTo("message");
        emailSender.sendEmail(emailMessage);
    }
}
