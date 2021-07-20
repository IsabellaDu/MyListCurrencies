package com.disabella.mylistcurrencies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.GsonBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.title)
        val gson = GsonBuilder().create()
        val data = gson.fromJson(jsonSample, PrivatApi::class.java)

        /*val list: List<ExchangeRate> = data.exchangeRate ?: emptyList()
        var result = ""
        list.forEach {
            result += "${it.currency}: ${it.saleRateNB}\n"
        }
        title.text = result*/

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(data)


    }
}
