package com.example.healthassist.ui

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import java.util.*

class AlarmInitReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // TIME_CHANGED instead of TIME_SET is intentional.
        when (intent.action) {
            Intent.ACTION_BOOT_COMPLETED, Intent.ACTION_LOCALE_CHANGED,
            Intent.ACTION_MY_PACKAGE_REPLACED,
            Intent.ACTION_TIME_CHANGED, Intent.ACTION_TIMEZONE_CHANGED -> {
                if (DataModel.reminderIsEnabled()) {
                    val now = Calendar.getInstance()
                    Notifications.possiblyAddMissedNotification(now)
                    Notifications.addAlarm(now, false)
                } else {
                    Notifications.possiblyCancelTheNotification()
                    Notifications.removeAlarm()
                }
            }
        }
    }
}
