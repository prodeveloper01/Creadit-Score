package com.free.validator.loan.homeloan.creditscrore.Service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.free.validator.loan.homeloan.creditscrore.R;
import com.free.validator.loan.homeloan.creditscrore.Splash_screen;

public class AlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (new SessionHelper(context).getBooleanData(SessionHelper.IS_NOTIFICATION_SEND)) {
            addNotification(context);
        } else {
            new SessionHelper(context).putBooleanData(SessionHelper.IS_NOTIFICATION_SEND, true);
        }
    }

    private void addNotification(Context context) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "notify_001");
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, Splash_screen.class), 201326592);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.setBigContentTitle("Bank Balance & Credit");
        builder.setSmallIcon(R.drawable.icon);
        builder.setAutoCancel(true);
        builder.setContentIntent(activity);
        builder.setContentTitle("Credit Score & Bank Balance");
        builder.setContentText("Check your free credit score from CIBIL and other credit bureaus. And choose from a wide range of personalized loan & credit card offers, from india’s top banks.");
        builder.setPriority(2);
        builder.setStyle(bigTextStyle);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel("Your_channel_id", "Channel human readable title", 4));
            builder.setChannelId("Your_channel_id");
        }
        notificationManager.notify(0, builder.build());
    }
}