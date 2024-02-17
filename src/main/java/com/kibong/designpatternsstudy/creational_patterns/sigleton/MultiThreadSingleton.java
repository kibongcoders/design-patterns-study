package com.kibong.designpatternsstudy.creational_patterns.sigleton;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class MultiThreadSingleton {

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<Settings1> nonSynchronizedSingleton(){
        return CompletableFuture.completedFuture(Settings1.getInstance());
    }

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<Settings2> synchronizedSingleton(){
        return CompletableFuture.completedFuture(Settings2.getInstance());
    }

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<Settings3> doubleCheckedSingleton(){
        return CompletableFuture.completedFuture(Settings3.getInstance());
    }

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<Settings4> staticInnerSingleton(){
        return CompletableFuture.completedFuture(Settings4.getInstance());
    }
}
