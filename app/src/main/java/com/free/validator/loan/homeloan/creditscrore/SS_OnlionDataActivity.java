package com.free.validator.loan.homeloan.creditscrore;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_OnlionDataActivity extends AppCompatActivity implements View.OnClickListener {
    public String ddf3141d5;
    FrameLayout frameLayout;
    ImageView ic_back;
    ImageView imageView2;
    private ImageView imgCopyLink;
    ImageView img_put;
    public String sasf3153t3;
    public String ss_f3148l5;
    public String ss_f3149l6;
    public String ss_f3150l7;
    public String ss_f3151t1;
    public String ss_f3152t2;
    public String sscopytxt;
    public String ssf3137d1;
    public String ssf3138d2;
    public String ssf3139d3;
    public String ssf3140d4;
    public String ssf3142d6;
    public String ssf3143d7;
    public String ssf3144l1;
    public String ssf3145l2;
    public String ssf3146l3;
    public String ssf3147l4;
    public String ssf3154t4;
    public String ssf3155t5;
    public String ssf3156t6;
    public String ssf3157t7;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_onlion_data);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        ImageView button = (ImageView) findViewById(R.id.imgCopyLink);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        this.imageView2 = button;
        button.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.title_text);
        TextView textView2 = (TextView) findViewById(R.id.onlinedesc);
        TextView textView3 = (TextView) findViewById(R.id.onlinelink);
        this.ss_f3151t1 = getIntent().getStringExtra("toolbar1");
        this.ssf3137d1 = getIntent().getStringExtra("t1");
        this.ssf3144l1 = getIntent().getStringExtra("t11");
        this.ss_f3152t2 = getIntent().getStringExtra("toolbar2");
        this.ssf3138d2 = getIntent().getStringExtra("t2");
        this.ssf3145l2 = getIntent().getStringExtra("t22");
        this.sasf3153t3 = getIntent().getStringExtra("toolbar3");
        this.ssf3139d3 = getIntent().getStringExtra("t3");
        this.ssf3146l3 = getIntent().getStringExtra("t33");
        this.ssf3154t4 = getIntent().getStringExtra("toolbar4");
        this.ssf3140d4 = getIntent().getStringExtra("t4");
        this.ssf3147l4 = getIntent().getStringExtra("t44");
        this.ssf3155t5 = getIntent().getStringExtra("toolbar5");
        this.ddf3141d5 = getIntent().getStringExtra("t5");
        this.ss_f3148l5 = getIntent().getStringExtra("t55");
        this.ssf3156t6 = getIntent().getStringExtra("toolbar6");
        this.ssf3142d6 = getIntent().getStringExtra("t6");
        this.ss_f3149l6 = getIntent().getStringExtra("t66");
        this.ssf3157t7 = getIntent().getStringExtra("toolbar7");
        this.ssf3143d7 = getIntent().getStringExtra("t7");
        this.ss_f3150l7 = getIntent().getStringExtra("t77");
        ImageView imageView = (ImageView) findViewById(R.id.img_put);
        this.img_put = imageView;
        imageView.setImageResource(getIntent().getIntExtra("image_url", R.drawable.icon));
        ImageView imageView2 = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_OnlionDataActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_OnlionDataActivity.this.startActivity(new Intent(SS_OnlionDataActivity.this, SS_CheckOnlionActivity.class));
            }
        });
        String str = this.ss_f3151t1;
        if (str != null && this.ssf3137d1 != null && this.ssf3144l1 != null) {
            textView.setText(str);
            textView2.setText(this.ssf3137d1);
            textView3.setText(this.ssf3144l1);
        }
        String str2 = this.ss_f3152t2;
        if (str2 != null && this.ssf3138d2 != null && this.ssf3145l2 != null) {
            textView.setText(str2);
            textView2.setText(this.ssf3138d2);
            textView3.setText(this.ssf3145l2);
        }
        String str3 = this.sasf3153t3;
        if (str3 != null && this.ssf3139d3 != null && this.ssf3146l3 != null) {
            textView.setText(str3);
            textView2.setText(this.ssf3139d3);
            textView3.setText(this.ssf3146l3);
        }
        String str4 = this.ssf3154t4;
        if (str4 != null && this.ssf3140d4 != null && this.ssf3147l4 != null) {
            textView.setText(str4);
            textView2.setText(this.ssf3140d4);
            textView3.setText(this.ssf3147l4);
        }
        String str5 = this.ssf3155t5;
        if (str5 != null && this.ddf3141d5 != null && this.ss_f3148l5 != null) {
            textView.setText(str5);
            textView2.setText(this.ddf3141d5);
            textView3.setText(this.ss_f3148l5);
        }
        String str6 = this.ssf3156t6;
        if (str6 != null && this.ssf3142d6 != null && this.ss_f3149l6 != null) {
            textView.setText(str6);
            textView2.setText(this.ssf3142d6);
            textView3.setText(this.ss_f3149l6);
        }
        String str7 = this.ssf3157t7;
        if (str7 != null && this.ssf3143d7 != null && this.ss_f3150l7 != null) {
            textView.setText(str7);
            textView2.setText(this.ssf3143d7);
            textView3.setText(this.ss_f3150l7);
        }
        this.sscopytxt = textView3.getText().toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.imgCopyLink) {
            if (this.ss_f3151t1 != null && this.ssf3137d1 != null && this.ssf3144l1 != null) {
                w();
            }
            if (this.ss_f3152t2 != null && this.ssf3138d2 != null && this.ssf3145l2 != null) {
                w();
            }
            if (this.sasf3153t3 != null && this.ssf3139d3 != null && this.ssf3146l3 != null) {
                w();
            }
            if (this.ssf3154t4 != null && this.ssf3140d4 != null && this.ssf3147l4 != null) {
                w();
            }
            if (this.ssf3155t5 != null && this.ddf3141d5 != null && this.ss_f3148l5 != null) {
                w();
            }
            if (this.ssf3156t6 != null && this.ssf3142d6 != null && this.ss_f3149l6 != null) {
                w();
            }
            if (this.ssf3157t7 == null || this.ssf3143d7 == null || this.ss_f3150l7 == null) {
                return;
            }
            w();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        SS_OnlionDataActivity.this.startActivity(new Intent(SS_OnlionDataActivity.this, SS_CheckOnlionActivity.class));
    }

    private void w() {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy_link", this.sscopytxt));
        Toast.makeText(this, "Link Copy", 0).show();
    }
}