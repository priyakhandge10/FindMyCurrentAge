package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    button.setOnClickListener {
        val userDOB = Integer.parseInt(etDOB.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val userAgeInYear = currentYear - userDOB
        txShowAge.text= "Your age is $userAgeInYear years"
    }

    }
}
