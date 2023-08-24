package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.warkiz.widget.IndicatorSeekBar;
import com.warkiz.widget.OnSeekChangeListener;
import com.warkiz.widget.SeekParams;

import vocsy.ads.GoogleAds;

public class Check_Offline_Act extends AppCompatActivity {
    public int f3090c1;
    public int f3091c2;
    public int f3092c3;
    public int f3093c4;
    public int f3094c5;
    public int f3095c6;
    public int f3096y;
    ImageView ic_back;
    private ImageView next;
    private IndicatorSeekBar ss_seek1;
    private IndicatorSeekBar ss_seek2;
    private IndicatorSeekBar ss_seek3;
    private IndicatorSeekBar ss_seek4;
    private IndicatorSeekBar ss_seek5;
    private IndicatorSeekBar ss_seek6;
    private IndicatorSeekBar s_seek7;
    private TextView ss_text_11;
    private TextView ss_text_2;
    private TextView ss_text_3;
    private TextView ss_text_4;
    private TextView ss_text_5;
    private TextView ss_text_6;
    private TextView ss_text_7;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_check_offline);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
//        GoogleAds.getInstance().addNativeView(this, findViewById(R.id.nativeLay1));
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Check_Offline_Act.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Check_Offline_Act.this.startActivity(new Intent(Check_Offline_Act.this, SS_HomeActivity.class));
            }
        });
        this.ss_text_11 = (TextView) findViewById(R.id.text_11);
        this.ss_text_2 = (TextView) findViewById(R.id.text_2);
        this.ss_text_3 = (TextView) findViewById(R.id.text_3);
        this.ss_text_4 = (TextView) findViewById(R.id.text_4);
        this.ss_text_5 = (TextView) findViewById(R.id.text_5);
        this.ss_text_6 = (TextView) findViewById(R.id.text_6);
        this.ss_text_7 = (TextView) findViewById(R.id.text_7);
        this.ss_seek1 = (IndicatorSeekBar) findViewById(R.id.seek1);
        this.ss_seek2 = (IndicatorSeekBar) findViewById(R.id.seek2);
        this.ss_seek3 = (IndicatorSeekBar) findViewById(R.id.seek3);
        this.ss_seek4 = (IndicatorSeekBar) findViewById(R.id.seek4);
        this.ss_seek5 = (IndicatorSeekBar) findViewById(R.id.seek5);
        this.ss_seek6 = (IndicatorSeekBar) findViewById(R.id.seek6);
        this.s_seek7 = (IndicatorSeekBar) findViewById(R.id.seek7);
        ImageView imageView2 = (ImageView) findViewById(R.id.next);
        this.next = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Check_Offline_Act.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(Check_Offline_Act.this, SS_CheckOfflineActivity1.class);
                intent.putExtra("y", Check_Offline_Act.this.f3096y);
                intent.putExtra("c1", Check_Offline_Act.this.f3090c1);
                intent.putExtra("c2", Check_Offline_Act.this.f3091c2);
                intent.putExtra("c3", Check_Offline_Act.this.f3092c3);
                intent.putExtra("c4", Check_Offline_Act.this.f3093c4);
                intent.putExtra("c5", Check_Offline_Act.this.f3094c5);
                intent.putExtra("c6", Check_Offline_Act.this.f3095c6);
                Check_Offline_Act.this.startActivity(intent);
            }
        });
        this.ss_seek1.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Check_Offline_Act.3
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = Check_Offline_Act.this.ss_text_11;
                textView.setText(seekParams.progress + "+ Years");
                Check_Offline_Act.this.f3096y = seekParams.progress;
                CheckOfflineActivity$2$$ExternalSyntheticToStringIfNotNull0.m(seekParams.seekBar);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                SumTotalb.a(sb, seekParams.tickText, "TAG");
            }
        });
        this.ss_seek2.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Check_Offline_Act.4
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = Check_Offline_Act.this.ss_text_2;
                textView.setText(seekParams.progress + "+");
                Check_Offline_Act.this.f3090c1 = seekParams.progress;
                CheckOfflineActivity$2$$ExternalSyntheticToStringIfNotNull0.m(seekParams.seekBar);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                SumTotalb.a(sb, seekParams.tickText, "TAG");
            }
        });
        this.ss_seek3.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Check_Offline_Act.5
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = Check_Offline_Act.this.ss_text_3;
                textView.setText(seekParams.progress + "+");
                Check_Offline_Act.this.f3091c2 = seekParams.progress;
                CheckOfflineActivity$2$$ExternalSyntheticToStringIfNotNull0.m(seekParams.seekBar);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                SumTotalb.a(sb, seekParams.tickText, "TAG");
            }
        });
        this.ss_seek4.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Check_Offline_Act.6
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = Check_Offline_Act.this.ss_text_4;
                textView.setText(seekParams.progress + "+");
                Check_Offline_Act.this.f3092c3 = seekParams.progress;
                CheckOfflineActivity$2$$ExternalSyntheticToStringIfNotNull0.m(seekParams.seekBar);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                SumTotalb.a(sb, seekParams.tickText, "TAG");
            }
        });
        this.ss_seek5.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Check_Offline_Act.7
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = Check_Offline_Act.this.ss_text_5;
                textView.setText(seekParams.progress + "+");
                Check_Offline_Act.this.f3093c4 = seekParams.progress;
                CheckOfflineActivity$2$$ExternalSyntheticToStringIfNotNull0.m(seekParams.seekBar);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                SumTotalb.a(sb, seekParams.tickText, "TAG");
            }
        });
        this.ss_seek6.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Check_Offline_Act.8
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = Check_Offline_Act.this.ss_text_6;
                textView.setText(seekParams.progress + "+");
                Check_Offline_Act.this.f3094c5 = seekParams.progress;
                CheckOfflineActivity$2$$ExternalSyntheticToStringIfNotNull0.m(seekParams.seekBar);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                SumTotalb.a(sb, seekParams.tickText, "TAG");
            }
        });
        this.s_seek7.setOnSeekChangeListener(new OnSeekChangeListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Check_Offline_Act.9
            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStartTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onStopTrackingTouch(IndicatorSeekBar indicatorSeekBar) {
            }

            @Override // com.free.validator.loan.homeloan.creditscrore.widget.OnSeekChangeListener
            public void onSeeking(SeekParams seekParams) {
                TextView textView = Check_Offline_Act.this.ss_text_7;
                textView.setText(seekParams.progress + "+");
                Check_Offline_Act.this.f3095c6 = seekParams.progress;
                CheckOfflineActivity$2$$ExternalSyntheticToStringIfNotNull0.m(seekParams.seekBar);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                SumTotalb.a(sb, seekParams.tickText, "TAG");
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, SS_HomeActivity.class));
    }
}
