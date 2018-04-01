package com.lizejun.demo.libutils;

import android.app.Application;

import com.lib.utils.UtilsRepository;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilsRepository.getInstance().context(this);
    }
}
