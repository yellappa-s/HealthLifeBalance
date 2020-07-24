package com.example.healthassist.ui.Remainder

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.example.healthassist.R
import com.example.healthassist.ui.Remainder.DataModel
import com.example.healthassist.ui.Remainder.Notifications

class ReminderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (DataModel.displayReminderWhenLocked()) {
            if (Build.VERSION.SDK_INT >= 27) {
                setShowWhenLocked(true)
            } else @Suppress("DEPRECATION") {
                window.addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED)
            }
        }
        @SuppressLint("InflateParams")
        val dialogContents = layoutInflater.inflate(R.layout.reminder_dialog, null)

        val dialog = AlertDialog.Builder(this)
            .setTitle(getString(R.string.reminder_title))
            .setView(dialogContents)
            .setNegativeButton(getString(R.string.reminder_snooze), null)
            .setOnCancelListener { finish() }
            .setOnDismissListener { finish() }
            .show()

        val okButton: Button = dialogContents.findViewById(R.id.button)
        okButton.setOnClickListener { clickOk(); dialog.dismiss() }
    }

    private fun clickOk() {
        if (!DataModel.hasTakenDrugToday()) {
            DataModel.takeDrugNow()
        }
        Notifications.possiblyCancelTheNotification()
    }
}