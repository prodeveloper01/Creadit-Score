package com.free.validator.loan.homeloan.creditscrore;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class BankAdpter extends RecyclerView.Adapter<BankAdpter.ViewHolder> {
    Activity activity;
    public Context context;
    public ArrayList<c> loanGuides;

    public BankAdpter(ArrayList<c> arrayList, Context context2, Activity activity2) {
        this.context = context2;
        this.loanGuides = arrayList;
        this.activity = activity2;
    }

    /* loaded from: classes.dex */
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.tv_loanGuide);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.ss_bank_list_layout_2, (ViewGroup) null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        viewHolder.textView.setText(this.loanGuides.get(i).text);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.free.validator.loan.homeloan.creditscrore.BankAdpter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(BankAdpter.this.activity, Bank_Detail_Act.class);
                intent.putExtra("bankname", BankAdpter.this.loanGuides.get(i).text);
                intent.putExtra("chckbalence", BankAdpter.this.loanGuides.get(i).text3);
                intent.putExtra("mini", BankAdpter.this.loanGuides.get(i).text4);
                intent.putExtra("custom", BankAdpter.this.loanGuides.get(i).text5).setFlags(268435456);
                BankAdpter.this.context.startActivity(intent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.loanGuides.size();
    }
}
