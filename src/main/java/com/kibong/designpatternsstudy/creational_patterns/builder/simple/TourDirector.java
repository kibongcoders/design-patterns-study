package com.kibong.designpatternsstudy.creational_patterns.builder.simple;

import com.kibong.designpatternsstudy.creational_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan hukuTrip(){
        return tourPlanBuilder.title("후쿠오카 여행")
                .nightsAndDays(2, 5)
                .startDate(LocalDate.of(2024, 10, 2))
                .whereToStay("에어 비엔비")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();
    }
}
