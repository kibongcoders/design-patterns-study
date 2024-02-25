package com.kibong.designpatternsstudy.creational_patters.prototype;

import com.kibong.designpatternsstudy.creational_patterns.protytype.before.GithubIssue;
import com.kibong.designpatternsstudy.creational_patterns.protytype.before.GithubRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PrototypeTest {

    @Test
    public void PrototypeInitTest(){
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue githubIssue2 = new GithubIssue(repository);
        githubIssue.setId(2);
        githubIssue.setTitle("2주차 과제:");
    }
}
