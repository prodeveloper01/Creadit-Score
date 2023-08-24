package com.free.validator.loan.homeloan.creditscrore;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes.dex */
public class Extra_Act extends AppCompatActivity {
    FrameLayout frameLayout;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
        this.frameLayout = (FrameLayout) findViewById(R.id.fl_adplaceholder);
        ((ImageView) findViewById(R.id.start_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Extra_Act.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Extra_Act extra_Act = Extra_Act.this;
                Extra_Act.this.startActivity(new Intent(Extra_Act.this, SS_HomeActivity.class));
            }
        });
        ((ImageView) findViewById(R.id.rateapp)).setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Extra_Act.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                try {
                    Extra_Act.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + Extra_Act.this.getPackageName())));
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(Extra_Act.this.getApplicationContext(), " unable to find market app", 1).show();
                }
            }
        });
        ((ImageView) findViewById(R.id.moreapp)).setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Extra_Act.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Extra_Act.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("")));
            }
        });
        ((ImageView) findViewById(R.id.policy)).setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Extra_Act.4
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Extra_Act.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("")));
            }
        });
    }
}
