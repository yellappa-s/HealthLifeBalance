package com.example.healthassist.ui.Remainder

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import java.util.*

class AlarmReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context, intent: Intent) {
        val now = Calendar.getInstance()
        Notifications.addAlarm(now, true)
        if (!DataModel.hasTakenDrugInTheSameDayAs(now)) {
            Notifications.sendReminderNotification(now, true)
        }
    }
}