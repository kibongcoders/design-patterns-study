package com.kibong.designpatternsstudy.creational_patterns.protytype.example;

import com.kibong.designpatternsstudy.creational_patterns.protytype.simple.GithubIssue;
import com.kibong.designpatternsstudy.creational_patterns.protytype.simple.GithubRepository;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

//        ModelMapper modelMapper = new ModelMapper();
//        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
//        System.out.println(githubIssueData);
    }
}
