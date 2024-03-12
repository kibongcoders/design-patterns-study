package com.kibong.designpatternsstudy.behavioral_patterns.interpreter.simple;

import java.util.Map;

public class PlusExpression implements PostfixExpression {

    private PostfixExpression left;
    private PostfixExpression right;

    public PlusExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
