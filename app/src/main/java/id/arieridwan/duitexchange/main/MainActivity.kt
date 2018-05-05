package id.arieridwan.duitexchange.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import id.arieridwan.duitexchange.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Initializing an empty ArrayList to be filled with rates
    val rates: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addDummyData()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        // Creates a vertical Layout Manager
        rv_rates.layoutManager = LinearLayoutManager(this)
        // Access the RecyclerView Adapter and load the data into it
        rv_rates.adapter = ExchangeAdapter(rates, this)
    }

    // Adds exchange to the empty rates ArrayList
    fun addDummyData() {
        rates.add("USD")
        rates.add("GBP")
        rates.add("IDR")
        rates.add("THB")
        rates.add("JPY")
        rates.add("CNY")
        rates.add("KRW")
    }

}
