package com.example.healthassist.ui.Remainder

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.os.SystemClock
import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.preference.PreferenceFragmentCompat
import com.example.healthassist.R
import androidx.preference.Preference
import java.util.*

class RemainderActivity : AppCompatActivity(), SharedPreferencesListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remainder)
        DataModel.init(this)
        Notifications.init(this)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.settings, SettingsFragment())
            .commit()
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
        updateBody(false)
        DataModel.addListener(this)
    }

    override fun onResume() {
        super.onResume()
        checkForMissedAlarms()
    }
    override fun onStop() {
        super.onStop()
        DataModel.removeListener(this)
    }
    private fun checkForMissedAlarms() {
        if (!DataModel.reminderIsEnabled()) { return }

        val nowTimestamp = Calendar.getInstance().timeInMillis
        val nextAlarmTimestamp = DataModel.getNextAlarmTimestamp()
        if (nowTimestamp - 1*60*1000L < nextAlarmTimestamp) { return }

        val timeSinceBoot = SystemClock.elapsedRealtime()
        if (timeSinceBoot < 5*60*1000L) { return }

        AlertDialog.Builder(this)
            .setTitle(R.string.missed_reminder_title)
            .setIcon(R.drawable.ic_pill)
            .setMessage(R.string.missed_reminder_message)
            .setPositiveButton(R.string.missed_reminder_button) { _, _ -> resetAlarms() }
            .setOnDismissListener { resetAlarms() }
            .show()
    }

    private fun resetAlarms() {
        Notifications.resetAlarm()
    }

    private fun updateBody(useFade: Boolean) {
        val drugTaken = DataModel.hasTakenDrugToday()
        val fragment =
            if (drugTaken) { MedicineTakenFragment()    }
            else           { MedicineNotTakenFragment() }

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            if (useFade) {
                setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            }
            commit()
        }
    }
    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
        if (key.equals(DataModel.DRUG_TAKEN_TIMESTAMP)) {
            updateBody(true)
        }
    }
    class MedicineNotTakenFragment : Fragment() {

        private lateinit var button: Button

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val root = inflater.inflate(R.layout.fragment_medicine_not_taken, container, false)
            button = root.findViewById(R.id.button)
            button.setOnClickListener { clickButton() }
            return root
        }

        private fun clickButton() {
            DataModel.takeDrugNow()
        }
    }

    class MedicineTakenFragment : Fragment() {

        private lateinit var drugTakenMessageView: TextView
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val root = inflater.inflate(R.layout.fragment_medicine_taken, container, false)
            drugTakenMessageView = root.findViewById(R.id.drug_taken_message)
            return root
        }

        override fun onResume() {
            super.onResume()
            val timestamp = DataModel.getDrugTakenTimestamp()
            val timeStr = DateFormat.getTimeFormat(activity).format(timestamp)
            val nbspTimeStr = timeStr.replace(" ", "\u00A0" )

            val drugTakenMessage = getString(R.string.drug_taken_message)
            drugTakenMessageView.text = String.format(drugTakenMessage, nbspTimeStr)

        }

    }

}