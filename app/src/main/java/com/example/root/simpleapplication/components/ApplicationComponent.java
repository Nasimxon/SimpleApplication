package com.example.root.simpleapplication.components;

import android.content.SharedPreferences;

import com.example.root.simpleapplication.MainActivity;
import com.example.root.simpleapplication.modules.AppModule;
import com.example.root.simpleapplication.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by root on 12/3/16.
 */

@Component(modules = {AppModule.class, NetModule.class})
@Singleton
public interface ApplicationComponent {
    Retrofit getRetrofit();

    SharedPreferences getSharedPreferences();

    void inject(MainActivity mainActivity);

}
