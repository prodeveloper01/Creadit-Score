package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class SS_GstActivity extends AppCompatActivity {
    public float amount;
    private RelativeLayout calculateTextView;
    public NumberFormat format;
    FrameLayout frameLayout;
    public float rate;
    public TextView sgstTv;
    public Spinner spRate;
    public EditText ssamt;
    public TextView ssamtTv;
    ImageView sscalculate_text_view;
    public TextView sscgstTv;
    public TextView ssgstAmtTv;
    ImageView ssic_back;
    ImageView ssreset_text_view;
    public TextView totalTv;

    public final float A(float f, float f2) {
        return (int) ((f2 / 100.0f) * f);
    }

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_gst);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        this.ssamt = (EditText) findViewById(R.id.amount_edit_text);
        this.spRate = (Spinner) findViewById(R.id.spRate);
        this.ssamtTv = (TextView) findViewById(R.id.net_price_amount);
        this.ssgstAmtTv = (TextView) findViewById(R.id.gst_price_result_text_view);
        this.sscgstTv = (TextView) findViewById(R.id.cgst);
        this.sgstTv = (TextView) findViewById(R.id.sgst);
        this.totalTv = (TextView) findViewById(R.id.net_price_result_text_view);
        this.format = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("5%");
//        arrayList.add("12%");
//        arrayList.add("18%");
//        arrayList.add("28%");
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);


//        this.spRate.setAdapter((SpinnerAdapter) arrayAdapter);
//
//        Spinner spRate = findViewById(R.id.spRate); // Replace with your spinner ID

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("5%");
        arrayList.add("12%");
        arrayList.add("18%");
        arrayList.add("28%");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList) {
            @NonNull
            @Override
            public View getView(int position, View convertView, @NonNull ViewGroup parent) {
                TextView textView = (TextView) super.getView(position, convertView, parent);
                textView.setTextColor(Color.WHITE); // Set white text color
                return textView;
            }

            @Override
            public View getDropDownView(int position, View convertView, @NonNull ViewGroup parent) {
                TextView textView = (TextView) super.getDropDownView(position, convertView, parent);
                textView.setTextColor(Color.BLACK); // Set white text color
                return textView;
            }
        };

// Specify the layout to use when the list of choices appears
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        arrayAdapter.setDropDownViewResource(17367049);
        spRate.setAdapter(arrayAdapter);


        ImageView imageView = (ImageView) findViewById(R.id.reset_text_view);
        this.ssreset_text_view = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_GstActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_GstActivity.this.reset();
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.ic_back);
        this.ssic_back = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_GstActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_GstActivity.this.startActivity(new Intent(SS_GstActivity.this, Calculator_Act.class));
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.calculate_text_view);
        this.sscalculate_text_view = imageView3;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.SS_GstActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SS_GstActivity.this.calculateGST();
            }
        });
    }

    public void reset() {
        this.ssamt.getText().clear();
        this.ssamtTv.setText(this.format.format(0.0d));
        this.ssgstAmtTv.setText(this.format.format(0.0d));
        this.sscgstTv.setText(this.format.format(0.0d));
        this.sgstTv.setText(this.format.format(0.0d));
        this.totalTv.setText(this.format.format(0.0d));
    }

    public void calculateGST() {
        try {
            this.amount = Float.valueOf(this.ssamt.getText().toString()).floatValue();
            this.rate = Float.valueOf(this.spRate.getSelectedItem().toString().replace("%", "")).floatValue();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        float f = this.amount;
        if (f == 0.0f || this.rate == 0.0f) {
            Toast.makeText(this, "Please enter details first", 0).show();
            return;
        }
        this.ssamtTv.setText(this.format.format(f));
        this.ssgstAmtTv.setText(this.format.format(A(this.amount, this.rate)));
        this.sscgstTv.setText(this.format.format(A(this.amount, this.rate) / 2.0f));
        this.sgstTv.setText(this.format.format(A(this.amount, this.rate) / 2.0f));
        TextView textView = this.totalTv;
        NumberFormat numberFormat = this.format;
        float f2 = this.amount;
        textView.setText(numberFormat.format(A(f2, this.rate) + f2));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, Calculator_Act.class));
    }
}
