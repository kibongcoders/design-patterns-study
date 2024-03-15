package com.kibong.designpatternsstudy.behavioral_patterns.state.simple;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
