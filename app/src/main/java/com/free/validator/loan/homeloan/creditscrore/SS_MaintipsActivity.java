package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_MaintipsActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    ImageView ic_back;
    public String ssans1;
    public String ssans11;
    public String ssans12;
    public String ssans13;
    public String ssans14;
    public String ssans2;
    public String ssans3;
    public String ssans4;
    ImageView ssbtn_BenefitsOfCreditScore;
    ImageView ssbtn_SecretsOfCreditScore;
    ImageView ssbtn_TipsOfCreditScore;
    public String sstitle1;
    public String sstitle11;
    public String sstitle12;
    public String sstitle13;
    public String sstitle14;
    public String sstitle2;
    public String sstitle3;
    private String sstti1;
    private String sstti2;
    public String stitle4;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_maintips);

        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        this.sstitle1 = getString(R.string.t11);
        this.sstitle2 = getString(R.string.t12);
        this.sstitle3 = getString(R.string.t13);
        this.stitle4 = getString(R.string.t14);
        this.ssans1 = getString(R.string.secret_ans_11);
        this.ssans2 = getString(R.string.secret_ans_12);
        this.ssans3 = getString(R.string.secret_ans_13);
        this.ssans4 = getString(R.string.secret_ans_14);
        this.sstitle11 = getString(R.string.t21);
        this.sstitle12 = getString(R.string.t22);
        this.sstitle13 = getString(R.string.t23);
        this.sstitle14 = getString(R.string.t24);
        this.ssans11 = getString(R.string.benefits_ans_1);
        this.ssans12 = getString(R.string.benefits_ans_2);
        this.ssans13 = getString(R.string.benefits_ans_3);
        this.ssans14 = getString(R.string.benefits_ans_4);
        this.sstti1 = getString(R.string.tt1);
        this.sstti2 = getString(R.string.tt2);
        ImageView imageView = (ImageView) findViewById(R.id.btn_SecretsOfCreditScore);
        this.ssbtn_SecretsOfCreditScore = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_MaintipsActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {

                        SS_MaintipsActivity.this.startActivity(new Intent(SS_MaintipsActivity.this, SecretBenefitActivity.class).putExtra("t11", SS_MaintipsActivity.this.sstitle11).putExtra("t12", SS_MaintipsActivity.this.sstitle12).putExtra("t13", SS_MaintipsActivity.this.sstitle13).putExtra("t14", SS_MaintipsActivity.this.sstitle14).putExtra("a11", SS_MaintipsActivity.this.ssans11).putExtra("a12", SS_MaintipsActivity.this.ssans12).putExtra("a13", SS_MaintipsActivity.this.ssans13).putExtra("a14", SS_MaintipsActivity.this.ssans14).putExtra("tti2", SS_MaintipsActivity.this.sstti2));

            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_MaintipsActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_MaintipsActivity.this.startActivity(new Intent(SS_MaintipsActivity.this, SS_HomeActivity.class));
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.btn_TipsOfCreditScore);
        this.ssbtn_TipsOfCreditScore = imageView3;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_MaintipsActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {

                        SS_MaintipsActivity.this.startActivity(new Intent(SS_MaintipsActivity.this, SSTipsActivity.class));

            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, SS_HomeActivity.class));
    }
}
