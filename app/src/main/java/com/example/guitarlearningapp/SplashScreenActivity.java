package com.example.guitarlearningapp;

import androidx.annotation.Size;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this);
        config.withFullScreen();
        config.withTargetActivity(MainActivity.class);
        config.withSplashTimeOut(5000);
        config.withBackgroundColor(Color.parseColor("#302E2E"));
        config.withLogo(R.mipmap.ic_launcher);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);

    }
}