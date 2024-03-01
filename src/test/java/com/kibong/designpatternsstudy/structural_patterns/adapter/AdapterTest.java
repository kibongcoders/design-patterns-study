package com.kibong.designpatternsstudy.structural_patterns.adapter;

import com.kibong.designpatternsstudy.structural_patterns.adapter.simple.AccountService;
import com.kibong.designpatternsstudy.structural_patterns.adapter.simple.AccountUserDetailsService;
import com.kibong.designpatternsstudy.structural_patterns.adapter.simple.security.LoginHandler;
import com.kibong.designpatternsstudy.structural_patterns.adapter.simple.security.UserDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AdapterTest {

    @Test
    public void adapterSimpleTest() {
        AccountService accountService = new AccountService();
        UserDetailsService accountUserDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(accountUserDetailsService);
        String login = loginHandler.login("kibong", "1234");
        log.info("login={}", login);
    }
}
