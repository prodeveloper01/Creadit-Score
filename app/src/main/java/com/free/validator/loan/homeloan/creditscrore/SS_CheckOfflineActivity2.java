package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.warkiz.widget.IndicatorSeekBar;
import com.warkiz.widget.OnSeekChangeListener;
import com.warkiz.widget.SeekParams;

import vocsy.ads.CustomAdsListener;
import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_CheckOfflineActivity2 extends AppCompatActivity {
    FrameLayout frameLayout;
    ImageView ic_back;
    private ImageView next;
    private IndicatorSeekBar seek1;
    private IndicatorSeekBar seek2;
    public int ssf3108a;
    public int ssf3109a2;
    public int ssf3110c1;
    public int ssf3111c2;
    public int ssf3112c3;
    public int ssf3113c4;
    public int ssf3114c5;
    public int ssf3115c6;
    public int ssf3116h1;
    public int ssf3117h2;
    public int ssf3118y;
    private TextView sstext_1;
    private TextView sstext_2;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_check_offline2);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOfflineActivity2.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_CheckOfflineActivity2.this.onBackPressed();
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.next);
        this.next = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOfflineActivity2.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GoogleAds.getInstance().showCounterInterstitialAd(SS_CheckOfflineActivity2.this, new CustomAdsListener() {
                    @Override
                    public void onFinish() {
                        Intent intent = new Intent(SS_CheckOfflineActivity2.this, SS_CheckOfflineActivity3.class);
                        intent.putExtra("y", SS_CheckOfflineActivity2.this.ssf3118y);
                        intent.putExtra("c1", SS_CheckOfflineActivity2.this.ssf3110c1);
                        intent.putExtra("c2", SS_CheckOfflineActivity2.this.ssf3111c2);
                        intent.putExtra("c3", SS_CheckOfflineActivity2.this.ssf3112c3);
                        intent.putExtra("c4", SS_CheckOfflineActivity2.this.ssf3113c4);
                        SS_CheckOfflineActivity2.this.startActivity(intent);
                    }
                });
            }
        });
        this.sstext_1 = (TextView) findViewById(R.id.text_1);
        this.sstext_2 = (TextView) findViewById(R.id.text_2);
        this.ssf3118y = getIntent().getIntExtra("y", 0);
        this.ssf3110c1 = getIntent().getIntExtra("c1", 0);
        this.ssf3111c2 = getIntent().getIntExtra("c2", 0);
        this.ssf3112c3 = getIntent().getIntExtra("c3", 0);
        this.ssf3113c4 = getIntent().getIntExtra("c4", 0);
        this.ssf3114c5 = getIntent().getIntExtra("c5", 0);
        this.ssf3115c6 = getIntent().getIntExtra("c6", 0);
        this.ssf3108a = getIntent().getIntExtra("a", 0);
        this.ssf3109a2 = getIntent().getIntExtra("a2", 0);
        this.seek1 = (IndicatorSeekBar) findViewById(R.id.seek1);
        this.seek2 = (IndicatorSeekBar) findViewById(R.id.seek2);
        this.seek1.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOfflineActivity2.3
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = SS_CheckOfflineActivity2.this.sstext_1;
                textView.setText("₹" + seekParams.progress);
                SS_CheckOfflineActivity2.this.ssf3116h1 = seekParams.progress;
            }
        });
        this.seek2.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOfflineActivity2.4
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = SS_CheckOfflineActivity2.this.sstext_2;
                textView.setText("₹" + seekParams.progress);
                SS_CheckOfflineActivity2.this.ssf3117h2 = seekParams.progress;
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }
}
