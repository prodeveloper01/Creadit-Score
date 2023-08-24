package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import kotlinx.coroutines.DebugKt;
import vocsy.ads.CustomAdsListener;
import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_CheckOfflineActivity3 extends AppCompatActivity {
    ImageView ic_back;
    private int myRandom;
    private ImageView see_full_report;
    public int ssf3120a;
    public int ssf3121a2;
    public int ssf3122c1;
    public int ssf3123c2;
    public int ssf3124c3;
    public int ssf3125c4;
    public int ssf3126c5;
    public int ssf3127c6;
    public int ssf3128h1;
    public int ssf3129h2;
    public int ssf3130s;
    public int ssf3131y;
    private TextView text;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_check_offline3);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOfflineActivity3.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_CheckOfflineActivity3.this.onBackPressed();
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.see_full_report);
        this.see_full_report = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOfflineActivity3.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GoogleAds.getInstance().showCounterInterstitialAd(SS_CheckOfflineActivity3.this, new CustomAdsListener() {
                    @Override
                    public void onFinish() {
                        Intent intent = new Intent(SS_CheckOfflineActivity3.this, ResultscreenActivity.class);
                        intent.putExtra("intent", DebugKt.DEBUG_PROPERTY_VALUE_OFF);
                        intent.putExtra("y", SS_CheckOfflineActivity3.this.ssf3131y);
                        intent.putExtra("c1", SS_CheckOfflineActivity3.this.ssf3122c1);
                        intent.putExtra("c2", SS_CheckOfflineActivity3.this.ssf3123c2);
                        intent.putExtra("c3", SS_CheckOfflineActivity3.this.ssf3124c3);
                        intent.putExtra("c4", SS_CheckOfflineActivity3.this.ssf3125c4);
                        intent.putExtra("c5", SS_CheckOfflineActivity3.this.ssf3126c5);
                        intent.putExtra("c6", SS_CheckOfflineActivity3.this.ssf3127c6);
                        intent.putExtra("a", SS_CheckOfflineActivity3.this.ssf3120a);
                        intent.putExtra("a2", SS_CheckOfflineActivity3.this.ssf3121a2);
                        intent.putExtra("h1", SS_CheckOfflineActivity3.this.ssf3128h1);
                        intent.putExtra("h2", SS_CheckOfflineActivity3.this.ssf3129h2);
                        intent.putExtra("s", SS_CheckOfflineActivity3.this.ssf3130s);
                        SS_CheckOfflineActivity3.this.startActivity(intent);
                    }
                });
            }
        });
        this.text = (TextView) findViewById(R.id.text);
        this.ssf3131y = getIntent().getIntExtra("y", 0);
        this.ssf3122c1 = getIntent().getIntExtra("c1", 0);
        this.ssf3123c2 = getIntent().getIntExtra("c2", 0);
        this.ssf3124c3 = getIntent().getIntExtra("c3", 0);
        this.ssf3125c4 = getIntent().getIntExtra("c4", 0);
        this.ssf3126c5 = getIntent().getIntExtra("c5", 0);
        this.ssf3127c6 = getIntent().getIntExtra("c6", 0);
        this.ssf3120a = getIntent().getIntExtra("a", 0);
        this.ssf3121a2 = getIntent().getIntExtra("a2", 0);
        this.ssf3128h1 = getIntent().getIntExtra("h1", 0);
        this.ssf3129h2 = getIntent().getIntExtra("h2", 0);
        this.myRandom = new Random().nextInt(201) + 600;
        StringBuilder sb = new StringBuilder("");
        sb.append(this.myRandom);
        this.ssf3130s = Integer.parseInt(sb.toString());
        this.text.setText(sb.toString());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        SS_CheckOfflineActivity3.this.finish();
    }
}
