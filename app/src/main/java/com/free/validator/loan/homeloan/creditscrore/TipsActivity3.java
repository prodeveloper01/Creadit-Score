package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class TipsActivity3 extends AppCompatActivity {
    FrameLayout frameLayout;
    ImageView ic_back;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_tips3);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.TipsActivity3.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TipsActivity3.this.startActivity(new Intent(TipsActivity3.this, SSTipsActivity.class));
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, SSTipsActivity.class));
    }
}
