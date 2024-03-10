package com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.chain_of_responsibility.before.Request;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        requestHandler.handle(request);
    }
}
