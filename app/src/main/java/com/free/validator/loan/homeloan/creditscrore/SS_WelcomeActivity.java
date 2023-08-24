package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_start;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_welcome);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().addNativeView(this, findViewById(R.id.nativeLay));
        ImageView imageView = (ImageView) findViewById(R.id.iv_start);
        this.iv_start = imageView;
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        GoogleAds.getInstance().showCounterInterstitialAd(this, () -> {
            if (view.getId() == R.id.iv_start && view.getId() == R.id.iv_start) {
                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putBoolean("button_1_pressed", true).apply();
                SS_WelcomeActivity.this.startActivity(new Intent(SS_WelcomeActivity.this, GetStart.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(SS_WelcomeActivity.this, SS_FinishActivity.class));
    }
}
