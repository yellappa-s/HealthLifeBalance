package com.example.healthassist.ui.Remainder


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.format.DateFormat
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat
import com.example.healthassist.R
import androidx.preference.Preference
import java.util.*

class RemainderActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remainder)
    }

    class SettingsFragment : PreferenceFragmentCompat() {

        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)

            val reminderTime : TimePreference = findPreference("reminder_time")!!
            reminderTime.summaryProvider = ReminderTimeSummaryProvider(requireActivity())

            val testButton : Preference = findPreference("test_reminder")!!
            testButton.setOnPreferenceClickListener { clickTestButton(); true  }
        }

        // The preference library has a boneheaded and inextensible design so we need to override
        // this function and copy paste some code from the original implementations.
        override fun onDisplayPreferenceDialog(preference: Preference?) {
            if (preference is TimePreference) {
                val bundle = Bundle(1); bundle.putString("key", preference.getKey())
                val fragment = TimePreferenceDialogFragmentCompat()
                fragment.setArguments(bundle)
                fragment.setTargetFragment(this, 0)
                fragment.show(requireFragmentManager(), null)
            } else {
                super.onDisplayPreferenceDialog(preference)
            }
        }

        private fun clickTestButton() {
            val now = Calendar.getInstance()
            Notifications.sendReminderNotification(now, true)
        }
    }

    class ReminderTimeSummaryProvider(private val ctx: Context): Preference.SummaryProvider<TimePreference>{

        override fun provideSummary(preference: TimePreference?): CharSequence? {
            val now = Calendar.getInstance()
            val cal = DataModel.dailyReminderTimeForTheSameDayAs(now)
            return DateFormat.getTimeFormat(ctx).format(cal.time)
        }
    }



}