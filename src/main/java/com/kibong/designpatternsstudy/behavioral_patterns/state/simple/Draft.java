package com.kibong.designpatternsstudy.behavioral_patterns.state.simple;

public class Draft implements State {

    private OnlineCourse onlineCourse;

    public Draft(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        throw new UnsupportedOperationException("드래프트 상태에서는 리뷰를 남길 수 없습니다.");
    }

    @Override
    public void addStudent(Student student) {
        onlineCourse.getStudents().add(student);
        if (onlineCourse.getStudents().size() > 1) {
            onlineCourse.changeState(new Private(onlineCourse));
        }
    }
}
