package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.AppUtil;
import vocsy.ads.CustomAdsListener;
import vocsy.ads.GoogleAds;

public class GetStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_start);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, (LinearLayout) findViewById(R.id.nativeLay));
        findViewById(R.id.start).setOnClickListener(v -> {
            GoogleAds.getInstance().showCounterInterstitialAd(GetStart.this, new CustomAdsListener() {
                @Override
                public void onFinish() {
                    startActivity(new Intent(GetStart.this, SS_HomeActivity.class));
                }
            });


        });
        findViewById(R.id.rate).setOnClickListener(v -> {

                    AppUtil.rateApp(GetStart.this);


        });
        findViewById(R.id.privacy).setOnClickListener(v -> {

                    AppUtil.privacyPolicy(GetStart.this, getString(R.string.privacy_policy));


        });
        findViewById(R.id.share).setOnClickListener(v -> {

                    AppUtil.shareApp(GetStart.this);


        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(GetStart.this, SS_WelcomeActivity.class));
    }
}