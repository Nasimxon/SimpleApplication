package com.example.root.simpleapplication;

import android.app.Application;

import com.example.root.simpleapplication.components.ApplicationComponent;
import com.example.root.simpleapplication.components.DaggerApplicationComponent;
import com.example.root.simpleapplication.modules.AppModule;
import com.example.root.simpleapplication.modules.NetModule;

/**
 * Created by root on 12/3/16.
 */

public class App extends Application {
    private ApplicationComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerApplicationComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public ApplicationComponent getNetComponent() {
        return mNetComponent;
    }
}