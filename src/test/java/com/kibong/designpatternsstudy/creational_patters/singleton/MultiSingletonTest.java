package com.kibong.designpatternsstudy.creational_patters.singleton;

import com.kibong.designpatternsstudy.creational_patterns.sigleton.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
@Slf4j
public class MultiSingletonTest {

    private final MultiThreadSingleton multiThreadSingleton;

    public MultiSingletonTest(MultiThreadSingleton multiThreadSingleton) {
        this.multiThreadSingleton = multiThreadSingleton;
    }

    public void nonSyncTest(int THREAD_COUNT) throws InterruptedException, ExecutionException {
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
    public void syncTest(int THREAD_COUNT) throws InterruptedException, ExecutionException {
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

    public void doubleCheckedTest(int THREAD_COUNT) throws InterruptedException, ExecutionException {
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

    public void staticInnerClassTest(int THREAD_COUNT) throws InterruptedException, ExecutionException {
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

    public void enumSingletonTest(int THREAD_COUNT) throws InterruptedException, ExecutionException {
        Set<Settings5> enumSingletonSet = ConcurrentHashMap.newKeySet();
        List<CompletableFuture<Settings5>> enumFutures = new ArrayList<>();

        long enumSingletonStart = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++) {
            CompletableFuture<Settings5> enumFuture = multiThreadSingleton.enumSingleton();
            enumFutures.add(enumFuture);
        }

        long enumSingletonEnd = System.currentTimeMillis();

        log.info("enumSingleton time {} ", enumSingletonEnd - enumSingletonStart);

        for (CompletableFuture<Settings5> enumFuture : enumFutures) {
            enumSingletonSet.add(enumFuture.get());
        }

        log.info("staticInnerSingletonSet.size()={}", enumSingletonSet.size());
        assertEquals(1, enumSingletonSet.size());
    }
}
