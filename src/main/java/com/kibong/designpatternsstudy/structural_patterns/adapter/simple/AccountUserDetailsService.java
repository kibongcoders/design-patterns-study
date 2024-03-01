package com.kibong.designpatternsstudy.structural_patterns.adapter.simple;

import com.kibong.designpatternsstudy.structural_patterns.adapter.simple.security.UserDetails;
import com.kibong.designpatternsstudy.structural_patterns.adapter.simple.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
