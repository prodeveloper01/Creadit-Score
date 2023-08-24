package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
import java.util.Locale;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class PPFActivity extends AppCompatActivity {
    private ImageView calculateTextView;
    private NumberFormat format;
    FrameLayout frameLayout;
    ImageView ic_back;
    private TextView maturityAmt;
    private ImageView resetTextView;
    private EditText ss_i_rate;
    private EditText ss_m_dpsit;
    private EditText ss_period;
    private TextView totDeposite;
    private TextView totInterest;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_ppfactivity);

        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        EditText editText = (EditText) findViewById(R.id.yearly_investment_amount_edit_text);
        this.ss_m_dpsit = editText;
        editText.addTextChangedListener(new TextWatcher() { // from class: com.free.validator.loan.homeloan.creditscrore.PPFActivity.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.ss_i_rate = (EditText) findViewById(R.id.interest_rate_edit_text);
        this.ss_period = (EditText) findViewById(R.id.Investment_Period);
        this.totInterest = (TextView) findViewById(R.id.total_interest_result_text_view);
        this.totDeposite = (TextView) findViewById(R.id.total_investment_amount_result_text_view);
        this.maturityAmt = (TextView) findViewById(R.id.maturity_amount_result_text_view);
        this.format = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        ImageView imageView = (ImageView) findViewById(R.id.reset_text_view);
        this.resetTextView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.PPFActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PPFActivity.this.reset();
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.PPFActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PPFActivity.this.startActivity(new Intent(PPFActivity.this, Calculator_Act.class));
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.calculate_text_view);
        this.calculateTextView = imageView3;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.PPFActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PPFActivity.this.calculatePPF();
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, Calculator_Act.class));
    }

    public void reset() {
        this.ss_m_dpsit.getText().clear();
        this.ss_i_rate.getText().clear();
        this.ss_period.getText().clear();
        this.totInterest.setText("");
        this.totDeposite.setText("");
        this.maturityAmt.setText("");
    }

    public void calculatePPF() {
        if (this.ss_m_dpsit.getText().toString().isEmpty() || this.ss_i_rate.getText().toString().isEmpty() || this.ss_period.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter details first", 0).show();
            return;
        }
        double parseDouble = Double.parseDouble(this.ss_m_dpsit.getText().toString().replace(",", ""));
        double parseDouble2 = Double.parseDouble(this.ss_i_rate.getText().toString());
        int parseInt = Integer.parseInt(this.ss_period.getText().toString());
        double d = parseDouble2 / 100.0d;
        double d2 = 0.0d;
        double d3 = parseDouble;
        for (int i = 0; i < parseInt; i++) {
            double d4 = d3 * d;
            d2 += d4;
            d3 += d4;
            if (i < parseInt - 1) {
                d3 += parseDouble;
            }
        }
        this.totInterest.setText(this.format.format(d2));
        TextView textView = this.totDeposite;
        NumberFormat numberFormat = this.format;
        double d5 = parseInt;
        Double.isNaN(d5);
        Double.isNaN(d5);
        Double.isNaN(d5);
        Double.isNaN(d5);
        textView.setText(numberFormat.format(parseDouble * d5));
        this.maturityAmt.setText(this.format.format(d3));
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(this);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }
}