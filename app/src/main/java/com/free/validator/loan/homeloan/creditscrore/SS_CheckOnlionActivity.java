package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.CustomAdsListener;
import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_CheckOnlionActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    public String sdes6;
    public String ssdes1;
    public String ssdes2;
    public String ssdes3;
    public String ssdes4;
    public String ssdes5;
    public String ssdes7;
    private ImageView ssic_back;
    private ImageView sslay1;
    private ImageView sslay2;
    private ImageView sslay3;
    private ImageView sslay4;
    private ImageView sslay5;
    private ImageView sslay6;
    private ImageView sslay7;
    private ImageView sslay8;
    public String sslink1;
    public String sslink2;
    public String sslink3;
    public String sslink4;
    public String sslink5;
    public String sslink6;
    public String sslink7;
    public String sstitle1;
    public String sstitle2;
    public String sstitle3;
    public String sstitle4;
    public String sstitle5;
    public String sstitle6;
    public String stitle7;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_check_onlion);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().addNativeView(this, findViewById(R.id.nativeLay));
        this.sstitle1 = getString(R.string.home);
        this.ssdes1 = getString(R.string.onlinestr1);
        this.sslink1 = getString(R.string.copylink1);
        this.sstitle2 = getString(R.string.buy);
        this.ssdes2 = getString(R.string.onlinestr2);
        this.sslink2 = getString(R.string.copylink2);
        this.sstitle3 = getString(R.string.report);
        this.ssdes3 = getString(R.string.onlinestr3);
        this.sslink3 = getString(R.string.copylink3);
        this.sstitle4 = getString(R.string.score);
        this.ssdes4 = getString(R.string.onlinestr4);
        this.sslink4 = getString(R.string.copylink4);
        this.sstitle5 = getString(R.string.dispute);
        this.ssdes5 = getString(R.string.onlinestr5);
        this.sslink5 = getString(R.string.copylink5);
        this.sstitle6 = getString(R.string.media);
        this.sdes6 = getString(R.string.onlinestr6);
        this.sslink6 = getString(R.string.copylink6);
        this.stitle7 = getString(R.string.mantri);
        this.ssdes7 = getString(R.string.onlinestr7);
        this.sslink7 = getString(R.string.copylink7);
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ssic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOnlionActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_CheckOnlionActivity.this.onBackPressed();
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.lay2);
        this.sslay2 = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOnlionActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(SS_CheckOnlionActivity.this, SS_OnlionDataActivity.class);
                intent.putExtra("image_url", R.drawable.btn_online_1);
                intent.putExtra("toolbar2", SS_CheckOnlionActivity.this.sstitle2);
                intent.putExtra("t2", SS_CheckOnlionActivity.this.ssdes2);
                intent.putExtra("t22", SS_CheckOnlionActivity.this.sslink2);
                SS_CheckOnlionActivity.this.startActivity(intent);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.lay3);
        this.sslay3 = imageView3;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOnlionActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GoogleAds.getInstance().showCounterInterstitialAd(SS_CheckOnlionActivity.this, new CustomAdsListener() {
                    @Override
                    public void onFinish() {
                        Intent intent = new Intent(SS_CheckOnlionActivity.this, SS_OnlionDataActivity.class);
                        intent.putExtra("image_url", R.drawable.btn_online_2);
                        intent.putExtra("toolbar3", SS_CheckOnlionActivity.this.sstitle3);
                        intent.putExtra("t3", SS_CheckOnlionActivity.this.ssdes3);
                        intent.putExtra("t33", SS_CheckOnlionActivity.this.sslink3);
                        SS_CheckOnlionActivity.this.startActivity(intent);
                    }
                });
            }
        });
        ImageView imageView4 = (ImageView) findViewById(R.id.lay4);
        this.sslay4 = imageView4;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOnlionActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(SS_CheckOnlionActivity.this, SS_OnlionDataActivity.class);
                intent.putExtra("image_url", R.drawable.btn_online_3);
                intent.putExtra("toolbar4", SS_CheckOnlionActivity.this.sstitle4);
                intent.putExtra("t4", SS_CheckOnlionActivity.this.ssdes4);
                intent.putExtra("t44", SS_CheckOnlionActivity.this.sslink4);
                SS_CheckOnlionActivity.this.startActivity(intent);
            }
        });
        ImageView imageView5 = (ImageView) findViewById(R.id.lay5);
        this.sslay5 = imageView5;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOnlionActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GoogleAds.getInstance().showCounterInterstitialAd(SS_CheckOnlionActivity.this, new CustomAdsListener() {
                    @Override
                    public void onFinish() {
                        SS_CheckOnlionActivity.this.startActivity(new Intent(SS_CheckOnlionActivity.this, SS_OnlionDataActivity.class).putExtra("image_url", R.drawable.btn_online_4).putExtra("toolbar5", SS_CheckOnlionActivity.this.sstitle5).putExtra("t5", SS_CheckOnlionActivity.this.ssdes5).putExtra("t55", SS_CheckOnlionActivity.this.sslink5));
                    }
                });
            }
        });
        ImageView imageView6 = (ImageView) findViewById(R.id.lay6);
        this.sslay6 = imageView6;
        imageView6.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOnlionActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(SS_CheckOnlionActivity.this, SS_OnlionDataActivity.class);
                intent.putExtra("image_url", R.drawable.btn_online_5);
                intent.putExtra("toolbar6", SS_CheckOnlionActivity.this.sstitle6);
                intent.putExtra("t6", SS_CheckOnlionActivity.this.sdes6);
                intent.putExtra("t66", SS_CheckOnlionActivity.this.sslink6);
                SS_CheckOnlionActivity.this.startActivity(intent);
            }
        });
        ImageView imageView7 = (ImageView) findViewById(R.id.lay7);
        this.sslay7 = imageView7;
        imageView7.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CheckOnlionActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GoogleAds.getInstance().showCounterInterstitialAd(SS_CheckOnlionActivity.this, new CustomAdsListener() {
                    @Override
                    public void onFinish() {
                        Intent intent = new Intent(SS_CheckOnlionActivity.this, SS_OnlionDataActivity.class);
                        intent.putExtra("image_url", R.drawable.btn_online_6);
                        intent.putExtra("toolbar7", SS_CheckOnlionActivity.this.stitle7);
                        intent.putExtra("t7", SS_CheckOnlionActivity.this.ssdes7);
                        intent.putExtra("t77", SS_CheckOnlionActivity.this.sslink7);
                        SS_CheckOnlionActivity.this.startActivity(intent);
                    }
                });
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        SS_CheckOnlionActivity.this.startActivity(new Intent(SS_CheckOnlionActivity.this, SS_HomeActivity.class));
    }
}
