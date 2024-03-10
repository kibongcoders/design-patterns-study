package com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.before.Request;

public abstract class RequestHandler {

    private RequestHandler nextRequestHandler;

    public RequestHandler(RequestHandler nextRequestHandler) {
        this.nextRequestHandler = nextRequestHandler;
    }

    public void handle(Request request) {
        if (nextRequestHandler != null) {
            nextRequestHandler.handle(request);
        }
    }
}
