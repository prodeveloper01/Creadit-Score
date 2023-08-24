package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.warkiz.widget.IndicatorSeekBar;
import com.warkiz.widget.OnSeekChangeListener;
import com.warkiz.widget.SeekParams;

import vocsy.ads.CustomAdsListener;
import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_CheckOfflineActivity1 extends AppCompatActivity {
    ImageView ic_back;
    private ImageView next;
    private IndicatorSeekBar seek1;
    private IndicatorSeekBar seek2;
    public int ssf3098a;
    public int ssf3099a2;
    public int ssf3100c1;
    public int ssf3101c2;
    public int ssf3102c3;
    public int ssf3103c4;
    public int ssf3104c5;
    public int ssf3105c6;
    public int ssf3106y;
    private TextView sstext_1;
    private TextView sstext_2;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_check_offline1);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOfflineActivity1.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_CheckOfflineActivity1.this.onBackPressed();
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.next);
        this.next = imageView2;
        imageView2.setOnClickListener(new AnonymousClass2());
        this.sstext_1 = (TextView) findViewById(R.id.text_1);
        this.sstext_2 = (TextView) findViewById(R.id.text_2);
        this.ssf3106y = getIntent().getIntExtra("y", 0);
        this.ssf3100c1 = getIntent().getIntExtra("c1", 0);
        this.ssf3101c2 = getIntent().getIntExtra("c2", 0);
        this.ssf3102c3 = getIntent().getIntExtra("c3", 0);
        this.ssf3103c4 = getIntent().getIntExtra("c4", 0);
        this.ssf3104c5 = getIntent().getIntExtra("c5", 0);
        this.ssf3105c6 = getIntent().getIntExtra("c6", 0);
        this.seek1 = (IndicatorSeekBar) findViewById(R.id.seek1);
        this.seek2 = (IndicatorSeekBar) findViewById(R.id.seek2);
        this.seek1.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOfflineActivity1.3
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = SS_CheckOfflineActivity1.this.sstext_1;
                textView.setText("₹" + seekParams.progress);
                SS_CheckOfflineActivity1.this.ssf3098a = seekParams.progress;
            }
        });
        this.seek2.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOfflineActivity1.4
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = SS_CheckOfflineActivity1.this.sstext_2;
                textView.setText("₹" + seekParams.progress);
                SS_CheckOfflineActivity1.this.ssf3099a2 = seekParams.progress;
            }
        });
    }

    /* renamed from: com.free.validator.loan.homeloan.creditscrore.SS_CheckOfflineActivity1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass2 implements View.OnClickListener {
        AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GoogleAds.getInstance().showCounterInterstitialAd(SS_CheckOfflineActivity1.this, new CustomAdsListener() {
                @Override
                public void onFinish() {
                    Intent intent = new Intent(SS_CheckOfflineActivity1.this, SS_CheckOfflineActivity2.class);
                    intent.putExtra("y", SS_CheckOfflineActivity1.this.ssf3106y);
                    intent.putExtra("c1", SS_CheckOfflineActivity1.this.ssf3100c1);
                    intent.putExtra("c2", SS_CheckOfflineActivity1.this.ssf3101c2);
                    intent.putExtra("c3", SS_CheckOfflineActivity1.this.ssf3102c3);
                    intent.putExtra("c4", SS_CheckOfflineActivity1.this.ssf3103c4);
                    intent.putExtra("c5", SS_CheckOfflineActivity1.this.ssf3104c5);
                    intent.putExtra("c6", SS_CheckOfflineActivity1.this.ssf3105c6);
                    intent.putExtra("a", SS_CheckOfflineActivity1.this.ssf3098a);
                    intent.putExtra("a2", SS_CheckOfflineActivity1.this.ssf3099a2);
                    SS_CheckOfflineActivity1.this.startActivity(intent);
                }
            });
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }
}
