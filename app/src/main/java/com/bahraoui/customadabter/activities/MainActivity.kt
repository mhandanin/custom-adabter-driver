package com.bahraoui.customadabter.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bahraoui.customadabter.R
import com.bahraoui.customadabter.customAdabter.driverAdapter
import com.bahraoui.customadabter.dataEtd.listDrivers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var lsv = findViewById<ListView>(R.id.lsv)

        var customAdabter = driverAdapter(this, listDrivers)
        lsv.adapter = customAdabter


        lsv.setOnItemClickListener { parent, view, position, id ->
            val intent=Intent(this,activityDetail::class.java)
            intent.putExtra("driver",position)
            startActivity(intent)
        }
    }

}