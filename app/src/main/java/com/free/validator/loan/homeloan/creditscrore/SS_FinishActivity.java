package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_FinishActivity extends AppCompatActivity {
    private ImageView iv_no;
    private ImageView iv_yes;
    ImageView spicon;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_finish);
        GoogleAds.getInstance().addNativeView(this, findViewById(R.id.nativeLay));
        getWindow().setFlags(1024, 1024);
        this.spicon = (ImageView) findViewById(R.id.spicon);
        ImageView imageView = (ImageView) findViewById(R.id.iv_yes);
        this.iv_yes = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_FinishActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_FinishActivity.this.finishAffinity();
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_no);
        this.iv_no = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_FinishActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_FinishActivity.this.onBackPressed();
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, SS_HomeActivity.class));
        finish();
    }
}