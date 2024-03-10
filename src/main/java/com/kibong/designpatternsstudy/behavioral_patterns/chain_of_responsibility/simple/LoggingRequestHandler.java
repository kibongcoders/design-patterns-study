package com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.before.Request;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
