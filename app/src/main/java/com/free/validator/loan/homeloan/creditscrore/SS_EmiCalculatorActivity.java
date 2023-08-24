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
import java.util.StringTokenizer;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_EmiCalculatorActivity extends AppCompatActivity {
    public float Months;
    public float Rate;
    ImageView calculateTextView;
    public float emi;
    public float f165b;
    public float f166ti;
    private NumberFormat format;
    FrameLayout frameLayout;
    ImageView ic_back;
    private TextView month_emi;
    private EditText pAmt;
    private EditText rate;
    ImageView resetTextView;
    private TextView sstot_int;
    private TextView sstot_pay;
    public String st1 = "0";
    public String st2 = "0";
    public String st3 = "0";
    private EditText term;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_emi_calculator);

        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        this.resetTextView = (ImageView) findViewById(R.id.reset_text_view);
        this.calculateTextView = (ImageView) findViewById(R.id.calculate_text_view);
        this.sstot_int = (TextView) findViewById(R.id.total_interest_result_text_view);
        this.sstot_pay = (TextView) findViewById(R.id.total_payable_amount_result_text_view);
        this.month_emi = (TextView) findViewById(R.id.emi_result_text_view);
        this.pAmt = (EditText) findViewById(R.id.principle_amount_edit_text);
        this.rate = (EditText) findViewById(R.id.interest_rate_edit_text);
        this.term = (EditText) findViewById(R.id.months_edit_text);
        this.calculateTextView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_EmiCalculatorActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_EmiCalculatorActivity.this.calculateEMI();
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_EmiCalculatorActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_EmiCalculatorActivity.this.startActivity(new Intent(SS_EmiCalculatorActivity.this, Calculator_Act.class));
            }
        });
        this.resetTextView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_EmiCalculatorActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_EmiCalculatorActivity.this.reset();
            }
        });
        this.pAmt.addTextChangedListener(new TextWatcher() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_EmiCalculatorActivity.4
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                try {
                    SS_EmiCalculatorActivity.this.pAmt.removeTextChangedListener(this);
                    String obj = SS_EmiCalculatorActivity.this.pAmt.getText().toString();
                    if (obj != null && !obj.equals("")) {
                        if (obj.startsWith(".")) {
                            SS_EmiCalculatorActivity.this.pAmt.setText("0.");
                        }
                        if (obj.startsWith("0") && !obj.startsWith("0.")) {
                            SS_EmiCalculatorActivity.this.pAmt.setText("");
                        }
                        String replaceAll = SS_EmiCalculatorActivity.this.pAmt.getText().toString().replaceAll(",", "");
                        if (!obj.equals("")) {
                            SS_EmiCalculatorActivity.this.pAmt.setText(SS_EmiCalculatorActivity.a(replaceAll));
                        }
                        EditText editText = SS_EmiCalculatorActivity.this.pAmt;
                        editText.setSelection(editText.getText().toString().length());
                    }
                    SS_EmiCalculatorActivity.this.pAmt.addTextChangedListener(this);
                } catch (Exception e) {
                    e.printStackTrace();
                    SS_EmiCalculatorActivity.this.pAmt.addTextChangedListener(this);
                }
            }
        });
        this.format = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
    }

    public static String a(String str) {
        String str2;
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        String str3 = "";
        if (stringTokenizer.countTokens() > 1) {
            str = stringTokenizer.nextToken();
            str2 = stringTokenizer.nextToken();
        } else {
            str2 = "";
        }
        int length = str.length() - 1;
        if (str.charAt(str.length() - 1) == '.') {
            length--;
            str3 = ".";
        }
        int i = 0;
        while (length >= 0) {
            if (i == 3) {
                str3 = SumTotalb.a(",", str3);
                i = 0;
            }
            str3 = str.charAt(length) + str3;
            i++;
            length--;
        }
        return str2.length() <= 0 ? str3 : SumTotalb.a(str2, ".", str3);
    }

    public void reset() {
        this.pAmt.getText().clear();
        this.pAmt.requestFocus();
        this.rate.getText().clear();
        this.term.getText().clear();
        this.sstot_int.setText(this.format.format(0.0d));
        this.sstot_pay.setText(this.format.format(0.0d));
        this.month_emi.setText(this.format.format(0.0d));
    }

    public void calculateEMI() {
        if (this.pAmt.getText().toString().isEmpty() || this.rate.getText().toString().isEmpty() || this.term.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter details first", 0).show();
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(this);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        this.st1 = this.pAmt.getText().toString();
        this.st2 = this.rate.getText().toString();
        this.st3 = this.term.getText().toString();
        float parseFloat = Float.parseFloat(this.st1.replace(",", ""));
        float parseFloat2 = Float.parseFloat(this.st2.replace(",", ""));
        float parseFloat3 = Float.parseFloat(this.st3.replace(",", ""));
        float f = (parseFloat2 / 12.0f) / 100.0f;
        this.Rate = f;
        this.Months = parseFloat3;
        float pow = (float) Math.pow(f + 1.0f, parseFloat3);
        float floatValue = ((this.Rate * parseFloat) * pow) / Float.valueOf(pow - 1.0f).floatValue();
        this.emi = floatValue;
        this.f166ti = (Float.valueOf(this.Months).floatValue() * floatValue) - parseFloat;
        this.month_emi.setText(this.format.format(this.emi));
        this.sstot_int.setText(this.format.format(this.f166ti));
        this.sstot_pay.setText(this.format.format(this.f166ti + parseFloat));
        this.f165b = parseFloat;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, Calculator_Act.class));
    }
}
