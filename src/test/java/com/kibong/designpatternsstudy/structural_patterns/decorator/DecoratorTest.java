package com.kibong.designpatternsstudy.structural_patterns.decorator;

import com.kibong.designpatternsstudy.structural_patterns.decorator.before.BeforeClient;
import com.kibong.designpatternsstudy.structural_patterns.decorator.before.SpamFilteringCommentService;
import com.kibong.designpatternsstudy.structural_patterns.decorator.simple.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DecoratorTest {

    private static boolean enableSpamFiltering = true;
    private static boolean enabledTrimming = false;

    @Test
    @DisplayName("데코레이터 패턴 사용하기 전 테스트")
    public void beforeDecoratorTest() {
        BeforeClient client = new BeforeClient(new SpamFilteringCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }

    @Test
    @DisplayName("데코레이터 패턴 적용해보기 테스트")
    public void simpleDecoratorTest() {
        CommentService commentService = new DefaultCommentService();

        if(enableSpamFiltering){
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if(enabledTrimming){
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
