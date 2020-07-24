package com.example.healthassist.ui.Remainder

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.healthassist.R
import java.util.*

private const val REMINDER_CHANNEL_ID = "channel_01"
private const val NOTIFICATION_ID = 1

object Notifications: SharedPreferencesListener {

    private lateinit var appContext: Context

    fun init(context: Context) {
        appContext = context.applicationContext
        DataModel.addListener(this)
    }

    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) { return }

        val notificationManager =
            appContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val channel01 = NotificationChannel(REMINDER_CHANNEL_ID,
            appContext.getString(R.string.reminder), NotificationManager.IMPORTANCE_HIGH)
        channel01.description = appContext.getString(R.string.notification_channel_description_1)
        notificationManager.createNotificationChannel(channel01)
    }

    fun sendReminderNotification(now: Calendar, shouldInterrupt: Boolean) {

        createNotificationChannels()

        val todaysReminderTime = DataModel.dailyReminderTimeForTheSameDayAs(now)

        val endOfDay = todaysReminderTime.clone() as Calendar
        endOfDay.set(Calendar.HOUR_OF_DAY, 0)
        endOfDay.set(Calendar.MINUTE, 0)
        endOfDay.set(Calendar.SECOND, 0)
        endOfDay.set(Calendar.MILLISECOND, 0)
        endOfDay.add(Calendar.DATE, 1)

        val intent = Intent(appContext, ReminderActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

        val pendingIntent =
            PendingIntent.getActivity(appContext, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        val builder =
            NotificationCompat.Builder(appContext, REMINDER_CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_pill)
                .setContentTitle(appContext.getString(R.string.notification_title))
                .setContentText(appContext.getString(R.string.notification_description))
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_REMINDER)
                .setContentIntent(pendingIntent)
                .setWhen(todaysReminderTime.timeInMillis)
                .setTimeoutAfter(endOfDay.timeInMillis - now.timeInMillis)

        if (!shouldInterrupt) {
            builder.setOnlyAlertOnce(true)
        }
        if (shouldInterrupt && DataModel.displayReminderWhenLocked()) {
            builder.setFullScreenIntent(pendingIntent, true)
        }

        val manager = NotificationManagerCompat.from(appContext)
        manager.notify(NOTIFICATION_ID, builder.build())
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
        if (key.equals(DataModel.DRUG_TAKEN_TIMESTAMP)
            || key.equals(DataModel.REMINDER_ENABLED)
            || key.equals(DataModel.REMINDER_TIME)
        ) {
            possiblyCancelTheNotification()
            resetAlarm()
        }
    }

    fun possiblyCancelTheNotification() {
        val now = Calendar.getInstance()
        val reminderEnabled= DataModel.reminderIsEnabled()
        val hasMedicated= DataModel.hasTakenDrugInTheSameDayAs(now)
        val reminderTime= DataModel.dailyReminderTimeForTheSameDayAs(now)
        if (!reminderEnabled || hasMedicated || now.before(reminderTime)) {
            NotificationManagerCompat.from(appContext).cancel(NOTIFICATION_ID)
        }
    }

    fun possiblyAddMissedNotification(now: Calendar) {
        val timeToday = DataModel.dailyReminderTimeForTheSameDayAs(now)
        if (now.after(timeToday) && !DataModel.hasTakenDrugInTheSameDayAs(now)) {
            sendReminderNotification(now, false)
        }
    }

    private fun alarmPendingIntent(): PendingIntent {
        val intent = Intent(appContext, AlarmReceiver::class.java)
        return PendingIntent.getBroadcast(appContext, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
    }

    fun addAlarm(now: Calendar, onlyTomorrow: Boolean) {
        val timeToday = DataModel.dailyReminderTimeForTheSameDayAs(now)
        val timeTomorrow = timeToday.clone() as Calendar
        timeTomorrow.add(Calendar.DATE, 1)

        val nowIsAfterTodaysMedicine = now.after(timeToday)
        val alarmCal =
            if (onlyTomorrow || nowIsAfterTodaysMedicine) { timeTomorrow } else { timeToday }
        val alarmTime = alarmCal.timeInMillis

        val pendingIntent = alarmPendingIntent()

        val alarmManager = appContext.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, alarmTime, pendingIntent)
        DataModel.setNextAlarmTimestamp(alarmTime)
    }

    fun removeAlarm() {
        val alarmManager = appContext.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.cancel(alarmPendingIntent())
    }

    fun resetAlarm() {
        if (DataModel.reminderIsEnabled()) {
            addAlarm(Calendar.getInstance(), false)
        } else {
            removeAlarm()
        }
    }
}