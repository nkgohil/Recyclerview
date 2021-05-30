package com.thesevenitsolutions.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    val postItems: ArrayList<simdetailspojo> = ArrayList<simdetailspojo>()
    var adapter: Adapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addData()
        rv.layoutManager  = LinearLayoutManager(this)
        rv.itemAnimator = DefaultItemAnimator()
        adapter = Adapter()
        rv.adapter =adapter
        adapter!!.addAllItems(postItems)

    }

    private fun addData() {
        postItems.add(simdetailspojo("Docomo Main Menu Check Code *191#"))
        postItems.add(simdetailspojo("Docomo Net Balance Check Code *111*1# or *191*5#"))
        postItems.add(simdetailspojo("Docomo GPRS Internet Setting Send SMS “INTERNET” to 52270"))
        postItems.add(simdetailspojo("Docomo Balance and Validity Check Code *191# or Dial 121111"))
        postItems.add(simdetailspojo("Docomo Best Recharge Offer Check Code *123# | *191*9*8#"))
    }
}