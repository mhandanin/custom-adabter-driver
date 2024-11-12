package com.bahraoui.customadabter.customAdabter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bahraoui.customadabter.R
import com.bahraoui.customadabter.etudian.Driver

class driverAdapter(var context: Context, var listEtd: List<Driver>) : BaseAdapter() {
    override fun getCount(): Int {
        return listEtd.size
    }

    override fun getItem(p0: Int): Any {
        return listEtd[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = p1 ?: LayoutInflater.from(context).inflate(R.layout.custom_list, p2, false)

        var textNom = view.findViewById<TextView>(R.id.nom)
        var textTitles = view.findViewById<TextView>(R.id.age)
        var textTeam = view.findViewById<TextView>(R.id.groupe)
        var image = view.findViewById<ImageView>(R.id.image)


        var etudiant = getItem(p0) as Driver

        textNom.text = etudiant.nom
        textTitles.text = etudiant.titles.toString()
        textTeam.text = etudiant.team
        image.setImageResource(etudiant.picture)

        return view
    }
}