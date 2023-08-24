package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.skydoves.powerspinner.PowerSpinnerView;

import java.text.NumberFormat;
import java.util.Locale;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_CompoundInterestActivity extends AppCompatActivity {
    private ImageView calculateTextView;
    public String f73s;
    private NumberFormat format;
    FrameLayout frameLayout;
    private PowerSpinnerView freq_spin;
    ImageView ic_back;
    private TextView maturityAmt;
    private TextView pAmt;
    ImageView resetTextView;
    private EditText ss_i_rate;
    private EditText ss_m_dpsit;
    private EditText ss_period;
    private TextView totInterest;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_compound_interest);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));

        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CompoundInterestActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_CompoundInterestActivity.this.startActivity(new Intent(SS_CompoundInterestActivity.this, Calculator_Act.class));
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.reset_text_view);
        this.resetTextView = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CompoundInterestActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_CompoundInterestActivity.this.reset();
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.calculate_text_view);
        this.calculateTextView = imageView3;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CompoundInterestActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_CompoundInterestActivity.this.calCulateComIntCal();
            }
        });
        this.ss_m_dpsit = (EditText) findViewById(R.id.principle_amount_edit_text);
        this.ss_i_rate = (EditText) findViewById(R.id.interest_rate_edit_text);
        this.ss_period = (EditText) findViewById(R.id.months_edit_text);
        this.freq_spin = (PowerSpinnerView) findViewById(R.id.freq_spin);
        this.pAmt = (TextView) findViewById(R.id.principle_amount_result_text_view);
        this.totInterest = (TextView) findViewById(R.id.simple_interest_result_text_view);
        this.maturityAmt = (TextView) findViewById(R.id.total_amount_result_text_view);
        this.format = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        this.freq_spin.setArrowAnimate(true);
        this.freq_spin.setLifecycleOwner(this);
        this.freq_spin.setSpinnerPopupElevation(10);
    }

    public void reset() {
        this.ss_m_dpsit.getText().clear();
        this.ss_i_rate.getText().clear();
        this.ss_period.getText().clear();
        this.pAmt.setText(this.format.format(0.0d));
        this.totInterest.setText(this.format.format(0.0d));
        this.maturityAmt.setText(this.format.format(0.0d));
    }

    public void calCulateComIntCal() {
        if (this.ss_m_dpsit.getText().toString().isEmpty() || this.ss_i_rate.getText().toString().isEmpty() || this.ss_period.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter details first", 0).show();
            return;
        }
        int selectedIndex = this.freq_spin.getSelectedIndex();
        if (selectedIndex == 0 || selectedIndex == 1 || selectedIndex == 2) {
            return;
        }
        double parseDouble = Double.parseDouble(this.ss_m_dpsit.getText().toString().replace(",", ""));
        double parseDouble2 = Double.parseDouble(this.ss_i_rate.getText().toString());
        double parseDouble3 = Double.parseDouble(this.ss_period.getText().toString());
        double d = ((parseDouble2 / 100.0d) / parseDouble3) + 1.0d;
        double parseDouble4 = (Double.parseDouble(this.ss_period.getText().toString()) / 12.0d) * parseDouble3;
        this.pAmt.setText(this.format.format(parseDouble));
        this.totInterest.setText(this.format.format(((Math.pow(d, parseDouble4) * parseDouble) + 0.0d) - parseDouble));
        this.maturityAmt.setText(this.format.format((Math.pow(d, parseDouble4) * parseDouble) + 0.0d));
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(this);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, Calculator_Act.class));
    }
}
