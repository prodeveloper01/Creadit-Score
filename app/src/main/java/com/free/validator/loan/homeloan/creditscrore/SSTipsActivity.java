package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SSTipsActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    ImageView ic_back;
    private ImageView sscv_1;
    private ImageView sscv_2;
    private ImageView sscv_3;
    private ImageView sscv_4;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_tips);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        ImageView imageView = (ImageView) findViewById(R.id.cv_1);
        this.sscv_1 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SSTipsActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SSTipsActivity sSTipsActivity = SSTipsActivity.this;
                SSTipsActivity.this.startActivity(new Intent(SSTipsActivity.this, SS_TipsActivity1.class));
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.cv_2);
        this.sscv_2 = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SSTipsActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SSTipsActivity sSTipsActivity = SSTipsActivity.this;
                SSTipsActivity.this.startActivity(new Intent(SSTipsActivity.this, SS_TipsActivity2.class));
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.cv_3);
        this.sscv_3 = imageView3;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SSTipsActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SSTipsActivity sSTipsActivity = SSTipsActivity.this;
                SSTipsActivity.this.startActivity(new Intent(SSTipsActivity.this, TipsActivity3.class));
            }
        });
        ImageView imageView4 = (ImageView) findViewById(R.id.cv_4);
        this.sscv_4 = imageView4;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SSTipsActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SSTipsActivity sSTipsActivity = SSTipsActivity.this;
                SSTipsActivity.this.startActivity(new Intent(SSTipsActivity.this, ss_TipsActivity4.class));
            }
        });
        ImageView imageView5 = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView5;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SSTipsActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SSTipsActivity sSTipsActivity = SSTipsActivity.this;
                SSTipsActivity.this.startActivity(new Intent(SSTipsActivity.this, SS_MaintipsActivity.class));
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, SS_MaintipsActivity.class));
    }
}
