package com.free.validator.loan.homeloan.creditscrore.Service;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class SessionHelper {
    public static final String ADS_DATA = "ads_data";
    public static final String IS_NOTIFICATION_SEND = "is_notification_send";
    Context context;
    SharedPreferences.Editor editor;
    SharedPreferences sharedPreferences;

    public SessionHelper(Context context2) {
        this.editor = null;
        this.sharedPreferences = null;
        this.context = context2;
        if (context2 != null) {
            SharedPreferences sharedPreferences = context2.getSharedPreferences(ADS_DATA, 0);
            this.sharedPreferences = sharedPreferences;
            this.editor = sharedPreferences.edit();
        }
    }

    public String getStringData(String str) {
        return this.sharedPreferences.getString(str, "");
    }

    public void putBooleanData(String str, Boolean bool) {
        this.editor.putBoolean(str, bool.booleanValue());
        this.editor.commit();
    }

    public Boolean getBooleanData(String str) {
        return Boolean.valueOf(this.sharedPreferences.getBoolean(str, false));
    }
}