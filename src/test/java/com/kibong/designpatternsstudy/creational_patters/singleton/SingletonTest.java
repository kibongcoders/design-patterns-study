package com.kibong.designpatternsstudy.creational_patters.singleton;

import com.kibong.designpatternsstudy.creational_patterns.sigleton.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
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
        final int THREAD_COUNT = 1000000;

        nonSyncTest(THREAD_COUNT);

        syncTest(THREAD_COUNT);

        doubleCheckedTest(THREAD_COUNT);

        staticInnerClassTest(THREAD_COUNT);
    }

    private void syncTest(int THREAD_COUNT) throws InterruptedException, ExecutionException {
        Set<Settings2> syncSingletonSet = ConcurrentHashMap.newKeySet();
        List<CompletableFuture<Settings2>> syncFutures = new ArrayList<>();

        long syncSingletonStart = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++) {
            CompletableFuture<Settings2> syncFuture = multiThreadSingleton.synchronizedSingleton();
            syncFutures.add(syncFuture);
        }
        long syncSingletonEnd = System.currentTimeMillis();

        log.info("syncSingleton time {} ", syncSingletonEnd - syncSingletonStart);


        for (CompletableFuture<Settings2> syncFuture : syncFutures) {
            syncSingletonSet.add(syncFuture.get());
        }

        log.info("syncSingletonSet.size()={}", syncSingletonSet.size());
        assertEquals(1, syncSingletonSet.size());
    }

    private void doubleCheckedTest(int THREAD_COUNT) throws InterruptedException, ExecutionException {
        Set<Settings3> doubleCheckedSingletonSet = ConcurrentHashMap.newKeySet();
        List<CompletableFuture<Settings3>> doubleCheckedFutures = new ArrayList<>();

        long doubleCheckedSingletonStart = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++) {
            CompletableFuture<Settings3> doubleCheckedFuture = multiThreadSingleton.doubleCheckedSingleton();
            doubleCheckedFutures.add(doubleCheckedFuture);
        }
        long doubleCheckedSingletonEnd = System.currentTimeMillis();

        log.info("doubleCheckedSingleton time {} ", doubleCheckedSingletonEnd - doubleCheckedSingletonStart);

        for (CompletableFuture<Settings3> doubleCheckedFuture : doubleCheckedFutures) {
            doubleCheckedSingletonSet.add(doubleCheckedFuture.get());
        }

        log.info("doubleCheckedSingletonSet.size()={}", doubleCheckedSingletonSet.size());
        assertEquals(1, doubleCheckedSingletonSet.size());
    }

    private void staticInnerClassTest(int THREAD_COUNT) throws InterruptedException, ExecutionException {
        Set<Settings4> staticInnerSingletonSet = ConcurrentHashMap.newKeySet();
        List<CompletableFuture<Settings4>> staticInnerFutures = new ArrayList<>();

        long staticInnerSingletonStart = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++) {
            CompletableFuture<Settings4> staticInnerFuture = multiThreadSingleton.staticInnerSingleton();
            staticInnerFutures.add(staticInnerFuture);
        }

        long staticInnerSingletonEnd = System.currentTimeMillis();

        log.info("staticInnerSingleton time {} ", staticInnerSingletonEnd - staticInnerSingletonStart);

        for (CompletableFuture<Settings4> staticInnerFuture : staticInnerFutures) {
            staticInnerSingletonSet.add(staticInnerFuture.get());
        }

        log.info("staticInnerSingletonSet.size()={}", staticInnerSingletonSet.size());
        assertEquals(1, staticInnerSingletonSet.size());
    }

    private void nonSyncTest(int THREAD_COUNT) throws InterruptedException, ExecutionException {
        Set<Settings1> singletonSet = ConcurrentHashMap.newKeySet();
        List<CompletableFuture<Settings1>> futures = new ArrayList<>();

        for (int i = 0; i < THREAD_COUNT; i++) {
            CompletableFuture<Settings1> future = multiThreadSingleton.nonSynchronizedSingleton();
            futures.add(future);
        }

        for (CompletableFuture<Settings1> future : futures) {
            singletonSet.add(future.get());
        }

        log.info("singletonSet.size()={}", singletonSet.size());
        assertEquals(true , singletonSet.size() >= 1);
    }
}
