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

import com.skydoves.powerspinner.PowerSpinnerView;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class S_FdActivity extends AppCompatActivity {
    private ImageView calculateTextView;
    public String f170s;
    private NumberFormat format;
    FrameLayout frameLayout;
    private PowerSpinnerView freq_spin;
    ImageView ic_back;
    private ImageView resetTextView;
    private EditText ss_i_rate;
    private EditText ss_m_dpsit;
    private TextView ss_maturityAmt;
    private EditText ss_period;
    private TextView ss_totDeposit;
    private TextView ss_totInterest;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_fd);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        ImageView imageView = (ImageView) findViewById(R.id.reset_text_view);
        this.resetTextView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.S_FdActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                S_FdActivity.this.reset();
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.ic_back);
        this.ic_back = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.S_FdActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                S_FdActivity.this.startActivity(new Intent(S_FdActivity.this, Calculator_Act.class));
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.calculate_text_view);
        this.calculateTextView = imageView3;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.S_FdActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                S_FdActivity.this.calculateFD();
            }
        });
        EditText editText = (EditText) findViewById(R.id.yearly_investment_amount_edit_text);
        this.ss_m_dpsit = editText;
        editText.addTextChangedListener(new TextWatcher() { // from class: com.free.validator.loan.homeloan.creditscrore.S_FdActivity.4
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                try {
                    S_FdActivity.this.ss_m_dpsit.removeTextChangedListener(this);
                    String obj = S_FdActivity.this.ss_m_dpsit.getText().toString();
                    if (obj != null && !obj.equals("")) {
                        if (obj.startsWith(".")) {
                            S_FdActivity.this.ss_m_dpsit.setText("0.");
                        }
                        if (obj.startsWith("0") && !obj.startsWith("0.")) {
                            S_FdActivity.this.ss_m_dpsit.setText("");
                        }
                        String replaceAll = S_FdActivity.this.ss_m_dpsit.getText().toString().replaceAll(",", "");
                        if (!obj.equals("")) {
                            S_FdActivity.this.ss_m_dpsit.setText(S_FdActivity.a(replaceAll));
                        }
                        EditText editText2 = S_FdActivity.this.ss_m_dpsit;
                        editText2.setSelection(editText2.getText().toString().length());
                    }
                    S_FdActivity.this.ss_m_dpsit.addTextChangedListener(this);
                } catch (Exception e) {
                    e.printStackTrace();
                    S_FdActivity.this.ss_m_dpsit.addTextChangedListener(this);
                }
            }
        });
        this.ss_i_rate = (EditText) findViewById(R.id.interest_rate_edit_text);
        this.ss_period = (EditText) findViewById(R.id.months_edit_text);
        this.freq_spin = (PowerSpinnerView) findViewById(R.id.freq_spin);
        this.ss_totInterest = (TextView) findViewById(R.id.total_interest_amount_result_text_view);
        this.ss_totDeposit = (TextView) findViewById(R.id.investment_amount_result_text_view);
        this.ss_maturityAmt = (TextView) findViewById(R.id.maturity_amount_result_text_view);
        this.format = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        this.freq_spin.setArrowAnimate(true);
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
        this.ss_m_dpsit.getText().clear();
        this.ss_i_rate.getText().clear();
        this.ss_period.getText().clear();
        this.ss_totInterest.setText(this.format.format(0.0d));
        this.ss_totDeposit.setText(this.format.format(0.0d));
        this.ss_maturityAmt.setText(this.format.format(0.0d));
    }

    public void calculateFD() {
        String str;
        if (this.ss_m_dpsit.getText().toString().isEmpty() || this.ss_i_rate.getText().toString().isEmpty() || this.ss_period.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter details first", 0).show();
            return;
        }
        int selectedIndex = this.freq_spin.getSelectedIndex();
        if (selectedIndex == 0) {
            str = "12";
        } else if (selectedIndex == 1) {
            str = "4";
        } else if (selectedIndex == 2) {
            str = "2";
        } else {
            str = selectedIndex == 3 ? "1" : null;
            double parseDouble = Double.parseDouble(this.ss_m_dpsit.getText().toString().replace(",", ""));
            double parseDouble2 = Double.parseDouble(this.ss_i_rate.getText().toString());
            double parseDouble3 = Double.parseDouble(this.f170s);
            double d = ((parseDouble2 / 100.0d) / parseDouble3) + 1.0d;
            double parseDouble4 = (Double.parseDouble(this.ss_period.getText().toString()) / 12.0d) * parseDouble3;
            this.ss_totInterest.setText(this.format.format(((Math.pow(d, parseDouble4) * parseDouble) + 0.0d) - parseDouble));
            this.ss_totDeposit.setText(this.format.format(parseDouble));
            this.ss_maturityAmt.setText(this.format.format((Math.pow(d, parseDouble4) * parseDouble) + 0.0d));
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
            View currentFocus = getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(this);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        this.f170s = str;
        double parseDouble5 = Double.parseDouble(this.ss_m_dpsit.getText().toString().replace(",", ""));
        double parseDouble6 = Double.parseDouble(this.ss_i_rate.getText().toString());
        double parseDouble7 = Double.parseDouble(this.f170s);
        double d2 = ((parseDouble6 / 100.0d) / parseDouble7) + 1.0d;
        double parseDouble8 = (Double.parseDouble(this.ss_period.getText().toString()) / 12.0d) * parseDouble7;
        this.ss_totInterest.setText(this.format.format(((Math.pow(d2, parseDouble8) * parseDouble5) + 0.0d) - parseDouble5));
        this.ss_totDeposit.setText(this.format.format(parseDouble5));
        this.ss_maturityAmt.setText(this.format.format((Math.pow(d2, parseDouble8) * parseDouble5) + 0.0d));
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, Calculator_Act.class));
    }
}
