package com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.before.Request;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
