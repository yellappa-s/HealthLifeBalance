package com.example.healthassist.ui.Remainder

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.text.format.DateFormat
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat
import com.example.healthassist.R
import androidx.preference.Preference
import java.util.*

class RemainderActivity : AppCompatActivity(), SharedPreferencesListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remainder)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.settings, SettingsFragment())
            .commit()
        DataModel.init(this)
        Notifications.init(this)
    }

    class SettingsFragment : PreferenceFragmentCompat() {

        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)

            val reminderTime : TimePreference = findPreference("reminder_time")!!
            reminderTime.summaryProvider = ReminderTimeSummaryProvider(requireActivity())

        }

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

    }

    class ReminderTimeSummaryProvider(private val ctx: Context): Preference.SummaryProvider<TimePreference>{

        override fun provideSummary(preference: TimePreference?): CharSequence? {
            val now = Calendar.getInstance()
            val cal = DataModel.dailyReminderTimeForTheSameDayAs(now)
            return DateFormat.getTimeFormat(ctx).format(cal.time)
        }
    }
    override fun onStart() {
        super.onStart()
        DataModel.addListener(this)
    }

    override fun onStop() {
        super.onStop()
        DataModel.removeListener(this)
    }
    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {

    }

}