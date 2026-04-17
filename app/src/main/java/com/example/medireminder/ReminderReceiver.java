package com.example.medireminder;

import android.app.*;
import android.content.*;
import androidx.core.app.NotificationCompat;

public class ReminderReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context c, Intent i) {

        NotificationCompat.Builder b = new NotificationCompat.Builder(c, "channel")
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Medication Reminder")
                .setContentText("Time to take your medicine!")
                .setPriority(NotificationCompat.PRIORITY_HIGH);

        NotificationManager m = (NotificationManager) c.getSystemService(Context.NOTIFICATION_SERVICE);
        m.notify(1, b.build());
    }
}