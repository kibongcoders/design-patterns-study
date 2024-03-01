package com.kibong.designpatternsstudy.structural_patterns.adapter.simple;

import com.kibong.designpatternsstudy.structural_patterns.adapter.simple.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getUsername();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
