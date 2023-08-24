package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.CustomAdsListener;
import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class ResultscreenActivity extends AppCompatActivity {
    private int a21;
    long back_pressed;
    private int c11;
    private int c21;
    private int c31;
    private int c41;
    private int c51;
    private int c61;
    Button calculate_text_view;
    private int f3160a1;
    private int f3171s1;
    private int f3173y1;
    private ImageView ghome;
    private int h11;
    private int h21;
    private ImageView homebtn;
    ImageView ic_back;
    private TextView s;
    private TextView ssa11111;
    private TextView ssa2;
    private TextView ssc1;
    private TextView ssc2;
    private TextView ssc3;
    private TextView ssc4;
    private TextView ssc5;
    private TextView ssc6;
    private TextView ssh1;
    private TextView ssh2;
    private TextView y;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_resultscreen);

        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        this.ic_back = (ImageView) findViewById(R.id.ic_back);
        this.calculate_text_view = (Button) findViewById(R.id.calculate_text_view);
        this.ic_back.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.ResultscreenActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ResultscreenActivity.this.onBackPressed();
            }
        });
        this.calculate_text_view.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.ResultscreenActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GoogleAds.getInstance().showCounterInterstitialAd(ResultscreenActivity.this, new CustomAdsListener() {
                    @Override
                    public void onFinish() {
                        ResultscreenActivity.this.startActivity(new Intent(ResultscreenActivity.this, Check_Offline_Act.class));
                    }
                });
            }
        });
        this.y = (TextView) findViewById(R.id.y);
        this.ssc1 = (TextView) findViewById(R.id.c1);
        this.ssc2 = (TextView) findViewById(R.id.c2);
        this.ssc3 = (TextView) findViewById(R.id.c3);
        this.ssc4 = (TextView) findViewById(R.id.c4);
        this.ssc5 = (TextView) findViewById(R.id.c5);
        this.ssc6 = (TextView) findViewById(R.id.c6);
        this.ssa11111 = (TextView) findViewById(R.id.a11111);
        this.ssa2 = (TextView) findViewById(R.id.a2);
        this.ssh1 = (TextView) findViewById(R.id.h1);
        this.ssh2 = (TextView) findViewById(R.id.h2);
        this.s = (TextView) findViewById(R.id.s);
        this.f3173y1 = getIntent().getIntExtra("y", 0);
        this.c11 = getIntent().getIntExtra("c1", 0);
        this.c21 = getIntent().getIntExtra("c2", 0);
        this.c31 = getIntent().getIntExtra("c3", 0);
        this.c41 = getIntent().getIntExtra("c4", 0);
        this.c51 = getIntent().getIntExtra("c5", 0);
        this.c61 = getIntent().getIntExtra("c6", 0);
        this.f3160a1 = getIntent().getIntExtra("a", 0);
        this.a21 = getIntent().getIntExtra("a2", 0);
        this.h11 = getIntent().getIntExtra("h1", 0);
        this.h21 = getIntent().getIntExtra("h2", 0);
        this.f3171s1 = getIntent().getIntExtra("s", 0);
        TextView textView = this.y;
        textView.setText(":-" + this.f3173y1 + " year");
        TextView textView2 = this.ssc1;
        textView2.setText(this.c11 + "+");
        TextView textView3 = this.ssc2;
        textView3.setText(this.c21 + "+");
        TextView textView4 = this.ssc3;
        textView4.setText(this.c31 + "+");
        TextView textView5 = this.ssc4;
        textView5.setText(this.c41 + "+");
        TextView textView6 = this.ssc5;
        textView6.setText(this.c51 + "+");
        TextView textView7 = this.ssc6;
        textView7.setText(this.c61 + "+");
        TextView textView8 = this.ssa11111;
        textView8.setText(":- " + this.f3160a1 + "");
        TextView textView9 = this.ssa2;
        textView9.setText(":- " + this.a21 + "");
        TextView textView10 = this.ssh1;
        textView10.setText(":- " + this.h11 + "");
        TextView textView11 = this.ssh2;
        textView11.setText(":- " + this.h21 + " year");
        TextView textView12 = this.s;
        textView12.setText(" " + this.f3171s1 + "");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.back_pressed + 1000 > System.currentTimeMillis()) {
            startActivity(new Intent(this, SS_HomeActivity.class));
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press once again to exit!", 0).show();
        }
        this.back_pressed = System.currentTimeMillis();
    }
}
