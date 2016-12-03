package com.example.root.simpleapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).getNetComponent().inject(this);

    }
}
