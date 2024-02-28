package com.kibong.designpatternsstudy.structural_patterns.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
