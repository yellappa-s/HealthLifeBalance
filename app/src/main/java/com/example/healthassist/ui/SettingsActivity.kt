
package com.example.healthassist.ui

import android.content.Context
import android.os.Bundle
import android.text.format.DateFormat
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.example.healthassist.R
import java.util.*

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.settings, SettingsFragment())
            .commit()
    }

    class SettingsFragment : PreferenceFragmentCompat() {

        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)

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

    }