package com.kibong.designpatternsstudy.structural_patterns.decorator.before;

public class BeforeClient {

    private CommentService commentService;

    public BeforeClient(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }

}
