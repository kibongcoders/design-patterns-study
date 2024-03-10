package com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
