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

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_CompareLoanActivity extends AppCompatActivity {
    private ImageView compare_text_view;
    private NumberFormat format;
    FrameLayout frameLayout;
    ImageView ic_back;
    ImageView reset_text_view;
    private TextView ssloanAmt1;
    private TextView ssloanAmt2;
    private TextView ssmEmi1;
    private TextView ssmEmi2;
    private EditText sspAmt1;
    private EditText sspAmt2;
    private EditText ssperiod1;
    private EditText ssperiod2;
    private EditText ssrate1;
    private EditText ssrate2;
    private TextView totInterest1;
    private TextView totInterest2;
    private TextView totPay1;
    private TextView totPay2;
    public String f167s1 = "0";
    public String f168s2 = "0";
    public String f169s3 = "0";
    public String st1 = "0";
    public String st2 = "0";
    public String st3 = "0";

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_compare_loan);

        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);

        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        this.frameLayout = (FrameLayout) findViewById(R.id.fl_adplaceholder);
        this.sspAmt1 = (EditText) findViewById(R.id.principle_amount_edit_text_one);
        this.sspAmt2 = (EditText) findViewById(R.id.principle_amount_edit_text_two);

        EditText editText = this.sspAmt1;
        editText.addTextChangedListener(new ontouch(editText));
        EditText editText2 = this.sspAmt2;
        editText2.addTextChangedListener(new ontouch(editText2));
        this.ssrate1 = (EditText) findViewById(R.id.interest_rate_edit_text_one);
        this.ssrate2 = (EditText) findViewById(R.id.interest_rate_edit_text_two);
        this.ssperiod1 = (EditText) findViewById(R.id.months_edit_text_one);
        this.ssperiod2 = (EditText) findViewById(R.id.months_edit_text_two);
        this.ssloanAmt1 = (TextView) findViewById(R.id.loanAmt1);
        this.ssloanAmt2 = (TextView) findViewById(R.id.loanAmt2);
        this.totInterest1 = (TextView) findViewById(R.id.interest_result_one);
        this.totInterest2 = (TextView) findViewById(R.id.interest_result_two);
        this.ssmEmi1 = (TextView) findViewById(R.id.emi_result_one);
        this.ssmEmi2 = (TextView) findViewById(R.id.emi_result_two);
        this.totPay1 = (TextView) findViewById(R.id.total_result_one);
        this.totPay2 = (TextView) findViewById(R.id.total_result_twq);
        this.format = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        ImageView imageView = (ImageView) findViewById(R.id.reset_text_view);
        this.reset_text_view = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CompareLoanActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_CompareLoanActivity.this.reset();
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.calculate_text_view);
        this.compare_text_view = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CompareLoanActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_CompareLoanActivity.this.compareEmi();
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView3;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_CompareLoanActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_CompareLoanActivity.this.startActivity(new Intent(SS_CompareLoanActivity.this, Calculator_Act.class));
            }
        });
    }

    public void compareEmi() {
        this.st1 = this.sspAmt1.getText().toString();
        this.st2 = this.ssrate1.getText().toString();
        this.st3 = this.ssperiod1.getText().toString();
        this.f167s1 = this.sspAmt2.getText().toString();
        this.f168s2 = this.ssrate2.getText().toString();
        this.f169s3 = this.ssperiod2.getText().toString();
        if (this.st1.isEmpty() || this.st2.isEmpty() || this.st3.isEmpty() || this.f167s1.isEmpty() || this.f168s2.isEmpty() || this.f169s3.isEmpty()) {
            Toast.makeText(this, "Please enter details first", 0).show();
            return;
        }
        B(this.st1, this.st2, this.st3, this.ssmEmi1, this.totInterest1, this.totPay1, this.ssloanAmt1);
        B(this.f167s1, this.f168s2, this.f169s3, this.ssmEmi2, this.totInterest2, this.totPay2, this.ssloanAmt2);
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(this);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public final void B(String str, String str2, String str3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        float parseFloat = Float.parseFloat(str.replace(",", ""));
        float parseFloat2 = Float.parseFloat(str2.replace(",", ""));
        float parseFloat3 = Float.parseFloat(str3.replace(",", ""));
        float f = (parseFloat2 / 12.0f) / 100.0f;
        float pow = (float) Math.pow(f + 1.0f, parseFloat3);
        float floatValue = ((f * parseFloat) * pow) / Float.valueOf(pow - 1.0f).floatValue();
        float floatValue2 = (Float.valueOf(parseFloat3).floatValue() * floatValue) - parseFloat;
        textView.setText(getString(R.string.Rs) + String.valueOf(B(floatValue, 2)));
        textView2.setText(getString(R.string.Rs) + String.valueOf(B(floatValue2, 2)));
        textView3.setText(getString(R.string.Rs) + String.valueOf(B(floatValue2 + parseFloat, 2)));
        textView4.setText(getString(R.string.Rs) + String.valueOf(B(parseFloat, 2)));
    }

    public static float B(float f, int i) {
        try {
            return new BigDecimal(Float.toString(f)).setScale(i, 4).floatValue();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public void reset() {
        this.sspAmt1.setText("");
        this.sspAmt2.setText("");
        this.ssrate1.setText("");
        this.ssrate2.setText("");
        this.ssperiod1.setText("");
        this.ssperiod2.setText("");
        this.ssloanAmt1.setText(this.format.format(0.0d));
        this.ssloanAmt2.setText(this.format.format(0.0d));
        this.ssmEmi1.setText(this.format.format(0.0d));
        this.ssmEmi2.setText(this.format.format(0.0d));
        this.totInterest1.setText(this.format.format(0.0d));
        this.totInterest2.setText(this.format.format(0.0d));
        this.totPay1.setText(this.format.format(0.0d));
        this.totPay2.setText(this.format.format(0.0d));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, Calculator_Act.class));
    }

    /* loaded from: classes.dex */
    private class ontouch implements TextWatcher {
        public EditText f2182a;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public ontouch(EditText editText) {
            this.f2182a = editText;
        }

        public String a(String str) {
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

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                this.f2182a.removeTextChangedListener(this);
                String obj = this.f2182a.getText().toString();
                if (obj != null && !obj.equals("")) {
                    if (obj.startsWith(".")) {
                        this.f2182a.setText("0.");
                    }
                    if (obj.startsWith("0") && !obj.startsWith("0.")) {
                        this.f2182a.setText("");
                    }
                    String replaceAll = this.f2182a.getText().toString().replaceAll(",", "");
                    if (!obj.equals("")) {
                        this.f2182a.setText(a(replaceAll));
                    }
                    EditText editText = this.f2182a;
                    editText.setSelection(editText.getText().toString().length());
                }
                this.f2182a.addTextChangedListener(this);
            } catch (Exception e) {
                e.printStackTrace();
                this.f2182a.addTextChangedListener(this);
            }
        }
    }
}