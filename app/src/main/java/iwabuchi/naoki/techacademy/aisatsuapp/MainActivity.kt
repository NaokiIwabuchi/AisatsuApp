
package iwabuchi.naoki.techacademy.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
                showTimePickerDialog()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (10 >hour && hour >= 2) {
                    tv.text = "おはよう"
                } else if (18 > hour && hour >= 10)  {
                    tv.text = "こんにちは"
                } else
                    tv.text = "こんばんは"
            },
            13, 0, true
        )
        timePickerDialog.show()
    }
}