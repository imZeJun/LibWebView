package com.lib.utils;

import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRepository {

    @IntDef({ExecutorType.DEFAULT_EXECUTOR_WORKER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExecutorType {
        int DEFAULT_EXECUTOR_WORKER = 1;
    }

    @IntDef({LooperType.DEFAULT_LOOPER_WORKER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LooperType {
        int DEFAULT_LOOPER_WORKER = 1;
    }

    private ConcurrentHashMap<Integer, ExecutorService> executorServices = new ConcurrentHashMap<>();
    private ConcurrentHashMap<Integer, Looper> executorLooper = new ConcurrentHashMap<>();

    public ExecutorService getExecutorService(@ExecutorType int executorType) {
        ExecutorService executorService = executorServices.get(executorType);
        if (executorService == null) {
            executorService = createExecutorService(executorType);
            if (executorService != null) {
                executorServices.put(executorType, executorService);
            }
        }
        return executorService;
    }

    public ExecutorService createExecutorService(@ExecutorType int executorType) {
        switch (executorType) {
            case ExecutorType.DEFAULT_EXECUTOR_WORKER:
                return Executors.newCachedThreadPool();
            default:
                return null;
        }
    }

    public Looper getExecutorLooper(@LooperType int looperType) {
        Looper looper = executorLooper.get(looperType);
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("looper = " + looperType);
            handlerThread.start();
            looper = handlerThread.getLooper();
            executorLooper.put(looperType, looper);
        }
        return looper;
    }
}
