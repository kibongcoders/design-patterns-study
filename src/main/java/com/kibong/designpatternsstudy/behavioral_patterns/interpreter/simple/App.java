package com.kibong.designpatternsstudy.behavioral_patterns.interpreter.simple;

import java.util.Map;

import static com.kibong.designpatternsstudy.behavioral_patterns.interpreter.simple.PostfixParser.parse;

public class App {

    public static void main(String[] args) {
        PostfixExpression expression = parse("xyz+-");
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4));
        System.out.println(result);
    }
}
