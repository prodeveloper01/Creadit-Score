package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import vocsy.ads.CustomAdsListener;
import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class Bank_Detail_Act extends AppCompatActivity implements View.OnClickListener {
    CardView BR11;
    CardView BR22;
    CardView Caed111;
    CardView RRRR1;
    private String bankname;
    private String chckbalence;
    private String custom;
    FrameLayout frameLayout;
    final Handler handler = new Handler();
    ImageView ic_back;
    private String mini;
    private ImageView ss_c1;
    private ImageView ss_c2;
    private ImageView ss_c3;
    private TextView ss_t1;
    private TextView ss_t2;
    private TextView ss_t3;
    private TextView textView;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_bank_detail);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        this.ss_t1 = (TextView) findViewById(R.id.t1);
        this.ss_t2 = (TextView) findViewById(R.id.t2);
        this.ss_t3 = (TextView) findViewById(R.id.t3);
        this.textView = (TextView) findViewById(R.id.bank_name);
        this.ss_c1 = (ImageView) findViewById(R.id.c1);
        this.ss_c2 = (ImageView) findViewById(R.id.c2);
        this.ss_c3 = (ImageView) findViewById(R.id.c3);
        this.bankname = getIntent().getStringExtra("bankname");
        this.chckbalence = getIntent().getStringExtra("chckbalence");
        this.mini = getIntent().getStringExtra("mini");
        this.custom = getIntent().getStringExtra("custom");
        this.textView.setText(this.bankname);
        this.ss_t1.setText(this.chckbalence);
        this.ss_t2.setText(this.mini);
        this.ss_t3.setText(this.custom);
        this.ss_c1.setOnClickListener(this);
        this.ss_c2.setOnClickListener(this);
        this.ss_c3.setOnClickListener(this);
        this.frameLayout = (FrameLayout) findViewById(R.id.fl_adplaceholder);
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Bank_Detail_Act.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Bank_Detail_Act.this.startActivity(new Intent(Bank_Detail_Act.this, Bank_List_Acty.class));
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Bank_Detail_Act.this.startActivity(new Intent(Bank_Detail_Act.this, Bank_List_Acty.class));
    }

    @Override
    public void onClick(View view) {
        GoogleAds.getInstance().showCounterInterstitialAd(this, new CustomAdsListener() {
            @Override
            public void onFinish() {
                if (view.getId() == R.id.c1 /* 2131361944 */) {
                    callone(chckbalence);
                } else if (view.getId() == R.id.c2 /* 2131361945 */) {
                    callone(mini);
                } else if (view.getId() == R.id.c3 /* 2131361946 */) {
                    callone(custom);
                }
            }
        });
    }

    public void callone(String str) {
        if (str.equals("NA")) {
            Toast.makeText(this, "Number Not Found!", 0).show();
            return;
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + str));
        startActivity(intent);
    }
}