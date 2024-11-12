package com.bahraoui.customadabter.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bahraoui.customadabter.R
import com.bahraoui.customadabter.customAdabter.driverAdapter
import com.bahraoui.customadabter.dataEtd.listDrivers


class activityDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_detail)
        val title=findViewById<TextView>(R.id.title)
        val image=findViewById<ImageView>(R.id.image)
        val name=findViewById<TextView>(R.id.name)
        val titles=findViewById<TextView>(R.id.titles)
        val team=findViewById<TextView>(R.id.team)
        val biography=findViewById<TextView>(R.id.biography)



        val reuperIntent=intent?.extras?.getInt("driver")
        Toast.makeText(this,reuperIntent!!.toString(),Toast.LENGTH_LONG).show()

        image.setImageResource(listDrivers[reuperIntent].picture)
        name.text= "Full Name: ${listDrivers[reuperIntent].nom}"
        titles.text= "Titles: ${listDrivers[reuperIntent].titles.toString()}"
        team.text= "Team: ${listDrivers[reuperIntent].team}"
        biography.text= "Biography:\n ${listDrivers[reuperIntent].biography}"


    }

}