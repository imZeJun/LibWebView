package com.lib.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;


public class UtilsRepository {

    private Context context;
    private ExecutorRepository executorRepository;
    private Handler uiHandler;

    private static final class Holder {
        private static final UtilsRepository sInstance = new UtilsRepository();
    }

    public static UtilsRepository getInstance() {
        return Holder.sInstance;
    }

    public UtilsRepository context(Context context) {
        this.context = context.getApplicationContext();
        return this;
    }

    public @NonNull Context getContext() {
        if (context == null) {
            throw new IllegalStateException("Must call context before use getContext");
        }
        return context;
    }

    public ExecutorRepository getExecutorRepository() {
        if (executorRepository == null) {
            executorRepository = new ExecutorRepository();
        }
        return executorRepository;
    }

    public Handler getUiHandler() {
        if (uiHandler == null) {
            uiHandler = new Handler(Looper.getMainLooper());
        }
        return uiHandler;
    }
}
