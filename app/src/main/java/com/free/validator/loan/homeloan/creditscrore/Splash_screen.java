package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.bumptech.glide.Glide;

import vocsy.ads.AdsHandler;
import vocsy.ads.GetSmartAdmob;

public class Splash_screen extends AppCompatActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_splash);
        AppCompatDelegate.setDefaultNightMode(1);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        String[] adsUrls = new String[]{
                getString(R.string.bnr_admob)// 1st Banner Ads Id
                , getString(R.string.native_admob)// 2st Native Ads Id
                , getString(R.string.int_admob)// 3st interstitial Ads Id
                , getString(R.string.app_open_admob)// 4st App-Open Ads Id
                , getString(R.string.video_admob)// 5st Rewarded Ads Id
        };

        new GetSmartAdmob(this, adsUrls, (success) -> {
            // admob init Success
        }).execute();

        AdsHandler.setAdsOn(true);
        ImageView gifView;
        gifView = findViewById(R.id.gifView);
        Glide.with(this).asGif().load(R.drawable.gif).into(gifView);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(Splash_screen.this, SS_WelcomeActivity.class));
            finish();
        }, 3000);
    }
}