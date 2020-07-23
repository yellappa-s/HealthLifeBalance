package com.example.healthassist.ui.Remainder

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.os.Build
import android.text.format.DateFormat
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.preference.DialogPreference
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import android.view.View
import android.widget.EditText
import android.widget.TimePicker
import android.widget.Toast
import androidx.preference.PreferenceDialogFragmentCompat
import com.example.healthassist.R

fun serializeTime(t0: Int, t1: Int): String {
    return String.format("%02d:%02d", t0, t1)
}

fun parseTime(value: String): Pair<Int, Int> {
    val times = value.split(":")
    if (times.size != 2 ) { throw IllegalArgumentException("Invalid date format") }

    val t0 = try {
        Integer.parseInt(times[0])
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("Hours is not a number")
    }

    val t1 = try {
        Integer.parseInt(times[1])
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("Minutes is not a number")
    }

    if (t0 !in 0..23) { throw IllegalArgumentException("Hours is out of range") }
    if (t1 !in 0..59) { throw IllegalArgumentException("Minutes is out of range") }
    return Pair(t0, t1)
}

class TimePreference : DialogPreference {

    var hour = 0
    var minute = 0
    private var valueIsSet = false

    @Suppress("unused")
    constructor(context: Context) : super(context)

    @Suppress("unused")
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    @Suppress("unused")
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    @Suppress("unused")
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes
    )

    override fun onGetDefaultValue(arr: TypedArray, i: Int): Any {
        return arr.getString(i) as Any
    }

    override fun onSetInitialValue(defaultValue: Any?) {
        val defaultString = (defaultValue ?: "00:00") as String
        val persisTedString = getPersistedString(defaultString)
        setTime(parseTime(persisTedString))
    }

    fun setTime(value: Pair<Int, Int>) {
        val (newHour, newMinute) = value
        val changed = (hour != newHour || minute != newMinute)
        if (!valueIsSet || changed) {
            hour = newHour
            minute = newMinute
            persistString(serializeTime(newHour, newMinute))
        }
        if (changed) {
            notifyChanged()
        }
    }
}
class TimePreferenceDialogFragmentCompat : PreferenceDialogFragmentCompat() {

    private var hasTimePicker = false
    private lateinit var timePicker: TimePicker
    private lateinit var editText: EditText

    override fun onCreateDialogView(context: Context): View {
        try {
            hasTimePicker = true
            timePicker = TimePicker(context)
            return timePicker
        } catch (e : NullPointerException){
            // There is a bug in some Samsung S5 devices, where the app crashes when we try to
            // instantiate the TimePicker. We hit an NPE deep inside android.widget.TimePicker,
            // when "onRtlPropertiesChanged" is called on a null value. To make the app work on my
            // mom's phone, the workaround is to use a plain text entry instead.
            hasTimePicker = false
            val view = createWorkaroundTimePicker(context)
            editText = view.findViewById(R.id.edit_text)!!
            return view
        }
    }

    @SuppressLint("InflateParams")
    private fun createWorkaroundTimePicker(context: Context): View {
        val layoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        return layoutInflater.inflate(R.layout.time_picker_workaround, null)
    }

    override fun onBindDialogView(view: View) {
        super.onBindDialogView(view)
        val pref = preference as TimePreference
        if (hasTimePicker) {
            timePicker.setIs24HourView(DateFormat.is24HourFormat(context))
            if (Build.VERSION.SDK_INT >= 23) {
                timePicker.hour = pref.hour
                timePicker.minute = pref.minute
            } else @Suppress("DEPRECATION") {
                timePicker.currentHour = pref.hour
                timePicker.currentMinute = pref.minute
            }
        } else {
            editText.setText(serializeTime(pref.hour, pref.minute))
        }
    }

    override fun onDialogClosed(positiveResult: Boolean) {
        if (!positiveResult) { return }

        var newTime: Pair<Int,Int>?

        if (hasTimePicker) {
            if (Build.VERSION.SDK_INT >= 23) {
                newTime = Pair(timePicker.hour, timePicker.minute)
            } else @Suppress("DEPRECATION") {
                newTime = Pair(timePicker.currentHour, timePicker.currentMinute)
            }
        } else {
            try {
                newTime = parseTime(editText.text.toString())
            } catch (e: IllegalArgumentException ) {
                newTime = null

                val activity = getActivity()
                if (activity != null) {
                    Toast.makeText(
                        activity,
                        activity.getString(R.string.reminder_time_edittext_format),
                        Toast.LENGTH_SHORT).show()
                }
            }
        }

        if (newTime != null) {
            val pref = preference as TimePreference
            if (pref.callChangeListener(newTime)) {
                pref.setTime(newTime)
            }
        }
    }
}