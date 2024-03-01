package com.kibong.designpatternsstudy.structural_patterns.adapter.simple.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
