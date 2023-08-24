package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SecretBenefitActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    ImageView ss_ic_back;
    public String ssa11;
    public String ssa12;
    public String ssa13;
    public String ssa14;
    public String ssf3175a1;
    public String ssf3176a2;
    public String ssf3177a3;
    public String ssf3178a4;
    public String ssf3179t1;
    public String ssf3180t2;
    public String ssf3181t3;
    public String ssf3182t4;
    public String sst11;
    public String sst12;
    public String sst13;
    public String sst14;
    public String sstti1;
    public String sstti2;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_secret_benefit);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        TextView textView = (TextView) findViewById(R.id.title_text);
        textView.setText("Credit Score Online");
        TextView textView2 = (TextView) findViewById(R.id.title1);
        TextView textView3 = (TextView) findViewById(R.id.title2);
        TextView textView4 = (TextView) findViewById(R.id.title3);
        TextView textView5 = (TextView) findViewById(R.id.title4);
        TextView textView6 = (TextView) findViewById(R.id.ans1);
        TextView textView7 = (TextView) findViewById(R.id.ans2);
        TextView textView8 = (TextView) findViewById(R.id.ans3);
        TextView textView9 = (TextView) findViewById(R.id.ans4);
        this.ssf3179t1 = getIntent().getStringExtra("t1");
        this.ssf3180t2 = getIntent().getStringExtra("t2");
        this.ssf3181t3 = getIntent().getStringExtra("t3");
        this.ssf3182t4 = getIntent().getStringExtra("t4");
        this.ssf3175a1 = getIntent().getStringExtra("a1");
        this.ssf3176a2 = getIntent().getStringExtra("a2");
        this.ssf3177a3 = getIntent().getStringExtra("a3");
        this.ssf3178a4 = getIntent().getStringExtra("a4");
        this.sstti1 = getIntent().getStringExtra("tti1");
        this.sstti2 = getIntent().getStringExtra("tti2");
        this.sst11 = getIntent().getStringExtra("t11");
        this.sst12 = getIntent().getStringExtra("t12");
        this.sst13 = getIntent().getStringExtra("t13");
        this.sst14 = getIntent().getStringExtra("t14");
        this.ssa11 = getIntent().getStringExtra("a11");
        this.ssa12 = getIntent().getStringExtra("a12");
        this.ssa13 = getIntent().getStringExtra("a13");
        this.ssa14 = getIntent().getStringExtra("a14");
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ss_ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SecretBenefitActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SecretBenefitActivity.this.startActivity(new Intent(SecretBenefitActivity.this, SS_MaintipsActivity.class));
            }
        });
        String str = this.ssf3179t1;
        if (str != null && this.ssf3180t2 != null && this.ssf3181t3 != null && this.ssf3182t4 != null && this.ssf3175a1 != null && this.ssf3176a2 != null && this.ssf3177a3 != null && this.ssf3178a4 != null && this.sstti1 != null) {
            textView2.setText(str);
            textView3.setText(this.ssf3180t2);
            textView4.setText(this.ssf3181t3);
            textView5.setText(this.ssf3182t4);
            textView.setText(this.sstti1);
            textView6.setText(this.ssf3175a1);
            textView7.setText(this.ssf3176a2);
            textView8.setText(this.ssf3177a3);
            textView9.setText(this.ssf3178a4);
        }
        String str2 = this.sst11;
        if (str2 == null || this.sst12 == null || this.sst13 == null || this.sst14 == null || this.ssa11 == null || this.ssa12 == null || this.ssa13 == null || this.ssa14 == null || this.sstti2 == null) {
            return;
        }
        textView2.setText(str2);
        textView3.setText(this.sst12);
        textView4.setText(this.sst13);
        textView5.setText(this.sst14);
        textView.setText(this.sstti2);
        textView6.setText(this.ssa11);
        textView7.setText(this.ssa12);
        textView8.setText(this.ssa13);
        textView9.setText(this.ssa14);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, SS_MaintipsActivity.class));
    }
}
