package com.kibong.designpatternsstudy.behavioral_patterns.interpreter.simple;

import java.util.Stack;

import static com.kibong.designpatternsstudy.behavioral_patterns.interpreter.simple.PostfixExpression.*;

public class PostfixParser {

    public PostfixParser() {
    }

    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            stack.push(getExpressionSimple(ch, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        return switch (c) {
            case '+' -> new PlusExpression(stack.pop(), stack.pop());
            case '-' -> new MinusExpression(stack.pop(), stack.pop());
            default -> new VariableExpression(c);
        };
    }

    private static PostfixExpression getExpressionSimple(char c, Stack<PostfixExpression> stack) {
        return switch (c) {
            case '+' -> plus(stack.pop(), stack.pop());
            case '-' -> minus(stack.pop(), stack.pop());
            default -> variable(c);
        };
    }
}
