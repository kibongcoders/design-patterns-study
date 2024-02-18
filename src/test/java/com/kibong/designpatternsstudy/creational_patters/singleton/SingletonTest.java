package com.kibong.designpatternsstudy.creational_patters.singleton;

import com.kibong.designpatternsstudy.creational_patterns.sigleton.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class SingletonTest {

    @Autowired
    MultiThreadSingleton multiThreadSingleton;

    @Test
    @DisplayName("인스턴스가 다름 테스트")
    void instanceDifferentTest(){
        Settings settings = new Settings();
        Settings settings1 = new Settings();

        assertNotEquals(settings, settings1);
    }

    @Test
    @DisplayName("간단한 싱글톤 패턴 생성 테스트")
    void naiveSingletonPatternCreateTest(){
        Settings1 settings = Settings1.getInstance();
        Settings1 settings1 = Settings1.getInstance();

        assertEquals(settings, settings1);
    }

    @Test
    @DisplayName("멀티 쓰레드 테스트")
    void multiThreadSingletonTest() throws ExecutionException, InterruptedException {
        MultiSingletonTest multiSingletonTest = new MultiSingletonTest(multiThreadSingleton);
        final int THREAD_COUNT = 1000000;

        multiSingletonTest.nonSyncTest(THREAD_COUNT);

        multiSingletonTest.syncTest(THREAD_COUNT);

        multiSingletonTest.doubleCheckedTest(THREAD_COUNT);

        multiSingletonTest.staticInnerClassTest(THREAD_COUNT);

        multiSingletonTest.enumSingletonTest(THREAD_COUNT);
    }

    @Test
    @DisplayName("리플랙션 사용해서 싱글톤 깨뜨리기 테스트")
    void reflectionSingletonTest() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings1 settings = Settings1.getInstance();
        Constructor<Settings1> constructor = Settings1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings1 settings1 = constructor.newInstance();

        assertNotEquals(settings, settings1);
    }
}
