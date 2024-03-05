package com.kibong.designpatternsstudy.structural_patterns.decorator.simple;

public class DefaultCommentService implements CommentService {

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
