package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes.dex */
public class SS_StartAct extends AppCompatActivity {
    FrameLayout frameLayout;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_activity_start);
        this.frameLayout = (FrameLayout) findViewById(R.id.fl_adplaceholder);
        ((ImageView) findViewById(R.id.start_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_StartAct.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                SS_StartAct sS_StartAct = SS_StartAct.this;
                SS_StartAct.this.startActivity(new Intent(SS_StartAct.this, Extra_Act.class));
            }
        });
    }
}
