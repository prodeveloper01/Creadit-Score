package com.free.validator.loan.homeloan.creditscrore;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.free.validator.loan.homeloan.creditscrore.Service.AlarmReceiver;

import java.util.Calendar;

import vocsy.ads.GoogleAds;

public class SS_HomeActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    ImageView ssbanklist;
    ImageView sscalculator;
    ImageView sscheckofflion;
    ImageView sscheckonlion;
    ImageView ssmaintips;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_home);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));

        setNotification();

        ImageView imageView = (ImageView) findViewById(R.id.checkofflion);
        this.sscheckofflion = imageView;
        imageView.setOnClickListener(view -> SS_HomeActivity.this.startActivity(new Intent(SS_HomeActivity.this, Check_Offline_Act.class)));
        ImageView imageView2 = (ImageView) findViewById(R.id.checkonlion);
        this.sscheckonlion = imageView2;
        imageView2.setOnClickListener(view -> SS_HomeActivity.this.startActivity(new Intent(SS_HomeActivity.this, SS_CheckOnlionActivity.class)));
        ImageView imageView3 = (ImageView) findViewById(R.id.maintips);
        this.ssmaintips = imageView3;
        imageView3.setOnClickListener(view -> SS_HomeActivity.this.startActivity(new Intent(SS_HomeActivity.this, SS_MaintipsActivity.class)));
        ImageView imageView4 = (ImageView) findViewById(R.id.calculator);
        this.sscalculator = imageView4;
        imageView4.setOnClickListener(view -> SS_HomeActivity.this.startActivity(new Intent(SS_HomeActivity.this, Calculator_Act.class)));
        ImageView imageView5 = (ImageView) findViewById(R.id.banklist);
        this.ssbanklist = imageView5;
        imageView5.setOnClickListener(view -> SS_HomeActivity.this.startActivity(new Intent(SS_HomeActivity.this, Bank_List_Acty.class)));
    }

    public void showBottomSheetDialog() {
        startActivity(new Intent(this, SS_FinishActivity.class));
    }

    @Override
    public void onBackPressed() {
        showBottomSheetDialog();
    }

    public void setNotification() {
        ((AlarmManager) getSystemService(Context.ALARM_SERVICE)).setRepeating(0, Calendar.getInstance().getTimeInMillis(), 10800000L, PendingIntent.getBroadcast(this, 0, new Intent(this, AlarmReceiver.class), 201326592));
    }
}