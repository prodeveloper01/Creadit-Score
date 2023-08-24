package com.free.validator.loan.homeloan.creditscrore;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import vocsy.ads.GoogleAds;

/* loaded from: classes.dex */
public class Bank_List_Acty extends AppCompatActivity {
    FrameLayout frameLayout;
    final Handler handler = new Handler();
    public ArrayList<c> loanGuides = new ArrayList<>();
    private RecyclerView recyclerView;
    ImageView ss_ic_back;

    @Override
    // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ss_activity_bank_list);
        SystemConfiguration.setTransparentStatusBar(this, SystemConfiguration.IconColor.ICON_LIGHT);
        GoogleAds.getInstance().admobBanner(this, findViewById(R.id.nativeLay));
        this.recyclerView = (RecyclerView) findViewById(R.id.bankListRecyclerView);
        this.loanGuides.add(new c("Axis Bank", "A", "18004195959", "18004196969", "18604195555"));
        this.loanGuides.add(new c("ICICI Bank", "I", "9594612612", "9594613613", "18002003344"));
        this.loanGuides.add(new c("IDBI Bank", "I", "18008431122", "18008431133", "18002094324"));
        this.loanGuides.add(new c("IDFC Bank", "I", "18002700720", "5676732", "18004194332"));
        this.loanGuides.add(new c("Dena Bank", "D", "09289356677", "09278656677", "18002336427"));
        this.loanGuides.add(new c("State Bank of India", "S", "09223766666", "09223866666", "18004253800"));
        this.loanGuides.add(new c("Bank of Baroda", "B", "08468001111", "08468001122", "18001024455"));
        this.loanGuides.add(new c("HDFC Bank", "H", "18002703333", "18002703355", "18602676161"));
        this.loanGuides.add(new c("Bank Of India", "B", "09015135135", "9810558585", "1800220229"));
        this.loanGuides.add(new c("Union Bank of India", "U", "09223008586", "09223008486", "18002082244"));
        this.loanGuides.add(new c("UCO Bank", "U", "09278792787", "09213125125", "18002740123"));
        this.loanGuides.add(new c("Kotak Mahindra Bank", "K", "18002740110", "9971056767", "18602662666"));
        this.loanGuides.add(new c("Punjab National Bank", "P", "18001802223", "5607040", "18001802222"));
        this.loanGuides.add(new c("Yes Bank", "Y", "09223920000", "09223921111", "18001200"));
        this.loanGuides.add(new c("Canara Bank", "C", "09015483483", "09015734744", "18004250018"));
        this.loanGuides.add(new c("Corporation Bank", "C", "09289792897", "5667716", "18004253555"));
        this.loanGuides.add(new c("Vijaya Bank", "V", "18001035525", "18001035535", "18004255885"));
        this.loanGuides.add(new c("Varachha Cooperative Bank Limited", "V", "02614008080", "NA", "18002587750"));
        this.loanGuides.add(new c("Allahabad Bank", "A", "09224150150", "09224150150", "18005722000"));
        this.loanGuides.add(new c("HSBC Bank", "H", "18001034722", "9611124722", "18001034722"));
        this.loanGuides.add(new c("South Indian Bank", "S", "09223008488", "9840777222", "18004251809"));
        this.loanGuides.add(new c("Dhanlaxmi Bank", "D", "08067747700", "08067747733", "04876613000"));
        this.loanGuides.add(new c("Central Bank of India", "C", "09555244442", "09555244441", "1800221911"));
        this.loanGuides.add(new c("Andhra Bank", "A", "09223011300", "9223173924", "18004251515"));
        this.loanGuides.add(new c("Indian Bank", "I", "09289592895", "944439443", "180042500000"));
        this.loanGuides.add(new c("Indian Overseas Bank", "I", "04442220004", "8424022122", "18004254445"));
        this.loanGuides.add(new c("United Bank Of India", "U", "092230085486", "09223008486", "18002082244"));
        this.loanGuides.add(new c("ANZ Bank", "A", "18002000269", "NA", "18002000269"));
        this.loanGuides.add(new c("Deutsche Bank", "D", "18001236601", "561615", "18602666601"));
        this.loanGuides.add(new c("Federal Bank", "F", "08431900900", "08431600600", "18004201199"));
        this.loanGuides.add(new c("Punjab & Sind Bank", "P", "07039035156", "9773056161", "18004198300"));
        this.loanGuides.add(new c("ABN Amro Bank", "A", "1800112224", "NA", "1800112224"));
        this.loanGuides.add(new c("Karnataka Bank", "K", "18004251445", "18004251446", "18004251444"));
        this.loanGuides.add(new c("DCB Bank", "D", "07506660011", "07506660022", "18002095363"));
        this.loanGuides.add(new c("Barclays Bank", "B", "02260007888", "NA", "02260007888"));
        this.loanGuides.add(new c("Bharatiya Mahila Bank", "B", "9212438888", "9212438888", "1147472100"));
        this.loanGuides.add(new c("Royal Bank of Scotland", "R", "09227148472", "NA", "1800112224"));
        this.loanGuides.add(new c("Tamilnad Mercantile Bank", "T", "09211927373", "NA", "9842461461"));
        this.loanGuides.add(new c("Syndicate Bank", "S", "09210332255", "9210332255", "180030113333"));
        this.loanGuides.add(new c("RBL Bank", "R", "18004190610", "9223366333", "18001238040"));
        this.loanGuides.add(new c("State Bank of Mysore", "S", "09223766666", "09223866666", "18004252244"));
        this.loanGuides.add(new c("Bank of Maharashtra", "B", "18002334526", "9223181818", "18002334526"));
        this.loanGuides.add(new c("Induslnd Bank", "I", "18002741000", "9212299955", "18605005004"));
        this.loanGuides.add(new c("Bandhan Bank", "B", "09223008666", "09223008777", "1800588181"));
        this.loanGuides.add(new c("Oriental Bank of Commerce", "O", "08067205757", "08067205767", "18001801235"));
        this.loanGuides.add(new c("State Bank of Hyderabad", "S", "09223766666", "09223866666", "18004251825"));
        this.loanGuides.add(new c("Lakshmi Vilas Bank", "L", "8882441155", "9282441155", "18004252233"));
        this.loanGuides.add(new c("State Bank of Patiyala", "S", "09223766666", "09223866666", "18001802010"));
        this.loanGuides.add(new c("State Bank of Bikaner & jaipur", "S", "09223766666", "092238666666", "18001806005"));
        this.loanGuides.add(new c("State Bank of Travancore", "S", "09223766666", "092238666666", "18004253800"));
        this.loanGuides.add(new c("Citi Bank", "C", "18602102484", "NA", "18602102484"));
        BankAdpter bankAdpter = new BankAdpter(this.loanGuides, this, this);
        getApplicationContext();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.recyclerView.setAdapter(bankAdpter);
        ImageView imageView = (ImageView) findViewById(R.id.ic_back);
        this.ss_ic_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.Bank_List_Acty.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Bank_List_Acty.this.startActivity(new Intent(Bank_List_Acty.this, SS_HomeActivity.class));
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Bank_List_Acty.this.startActivity(new Intent(Bank_List_Acty.this, SS_HomeActivity.class));
    }
}