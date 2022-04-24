package com.solvd.laba.home.task.service.impl;

import com.solvd.laba.home.task.service.IRunSolvdLabaThreads;
import com.solvd.laba.model.ThreadInfo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunSolvdLabaThreadsImpl implements IRunSolvdLabaThreads {
    private static final int COUNT_OF_THREADS = 10;

    @Override
    public void runSolvdLabaThreads() {
        ExecutorService executorService = Executors.newFixedThreadPool(COUNT_OF_THREADS);
        for (int i = 0; i < COUNT_OF_THREADS; i++) {
            Runnable r = new ThreadInfo();
            executorService.submit(r);
        }
        executorService.shutdown();
    }
}
