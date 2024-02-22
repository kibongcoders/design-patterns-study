package com.kibong.designpatternsstudy.creational_patters.builder;

import com.kibong.designpatternsstudy.creational_patterns.builder.before.TourPlan;
import com.kibong.designpatternsstudy.creational_patterns.builder.simple.DefaultTourBuilder;
import com.kibong.designpatternsstudy.creational_patterns.builder.simple.TourDirector;
import com.kibong.designpatternsstudy.creational_patterns.builder.simple.TourPlanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BuilderTest {

    @Test
    @DisplayName("간단한 빌더 만들기 테스트")
    public void simpleBuilderTest(){
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("후쿠오카 여행")
                .nightsAndDays(2, 5)
                .startDate(LocalDate.of(2024, 10, 2))
                .whereToStay("에어 비엔비")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();

        assertEquals(5, plan.getDays());
    }

    @Test
    @DisplayName("디렉터를 이용해 가져오기 테스트")
    public void getBuilderByDirector(){
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan plan = director.hukuTrip();
        assertEquals(5, plan.getDays());
    }


}
