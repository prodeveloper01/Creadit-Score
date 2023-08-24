package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class Calculator_Act extends AppCompatActivity {
    FrameLayout frameLayout;
    ImageView ic_back;
    private ImageView ss_img1;
    private ImageView ss_img2;
    private ImageView ss_img3;
    private ImageView ss_img4;
    private ImageView ss_img5;
    private ImageView ss_img6;
    private ImageView ss_img7;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_calculator);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        GoogleAds.getInstance().addNativeView(this, findViewById(R.id.nativeLay1));
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Calculator_Act.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Calculator_Act.this.startActivity(new Intent(Calculator_Act.this, SS_HomeActivity.class));
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.img1);
        this.ss_img1 = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Calculator_Act.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Calculator_Act calculator_Act = Calculator_Act.this;
                Calculator_Act.this.startActivity(new Intent(Calculator_Act.this, SS_CompoundInterestActivity.class));
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.img2);
        this.ss_img2 = imageView3;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Calculator_Act.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Calculator_Act calculator_Act = Calculator_Act.this;
                Calculator_Act.this.startActivity(new Intent(Calculator_Act.this, SS_EmiCalculatorActivity.class));
            }
        });
        ImageView imageView4 = (ImageView) findViewById(R.id.img3);
        this.ss_img3 = imageView4;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Calculator_Act.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Calculator_Act calculator_Act = Calculator_Act.this;
                Calculator_Act.this.startActivity(new Intent(Calculator_Act.this, SS_GstActivity.class));
            }
        });
        ImageView imageView5 = (ImageView) findViewById(R.id.img4);
        this.ss_img4 = imageView5;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Calculator_Act.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Calculator_Act calculator_Act = Calculator_Act.this;
                Calculator_Act.this.startActivity(new Intent(Calculator_Act.this, S_FdActivity.class));
            }
        });
        ImageView imageView6 = (ImageView) findViewById(R.id.img5);
        this.ss_img5 = imageView6;
        imageView6.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Calculator_Act.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Calculator_Act calculator_Act = Calculator_Act.this;
                Calculator_Act.this.startActivity(new Intent(Calculator_Act.this, RdActivity.class));
            }
        });
        ImageView imageView7 = (ImageView) findViewById(R.id.img6);
        this.ss_img6 = imageView7;
        imageView7.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Calculator_Act.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Calculator_Act calculator_Act = Calculator_Act.this;
                Calculator_Act.this.startActivity(new Intent(Calculator_Act.this, PPFActivity.class));
            }
        });
        ImageView imageView8 = (ImageView) findViewById(R.id.img7);
        this.ss_img7 = imageView8;
        imageView8.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Calculator_Act.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Calculator_Act calculator_Act = Calculator_Act.this;
                Calculator_Act.this.startActivity(new Intent(Calculator_Act.this, SS_CompareLoanActivity.class));
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Calculator_Act.this.startActivity(new Intent(Calculator_Act.this, SS_HomeActivity.class));
    }
}