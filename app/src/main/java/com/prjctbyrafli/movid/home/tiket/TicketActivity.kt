package com.prjctbyrafli.movid.home.tiket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.prjctbyrafli.movid.R
import com.prjctbyrafli.movid.model.Checkout
import com.prjctbyrafli.movid.model.Film
import kotlinx.android.synthetic.main.activity_ticket.*

class TicketActivity : AppCompatActivity() {
    
    private var dataList = ArrayList<Checkout>()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket)

        var data = intent.getParcelableExtra<Film>("data")

        tv_title.text = data.judul
        tv_genre.text = data.genre
        tv_rate.text = data.rating

        Glide.with(this)
            .load(data.poster)
            .into((iv_poster_image))

        rc_checkout.layoutManager = LinearLayoutManager(this)
        dataList.add(Checkout("A1", ""))
        dataList.add(Checkout("A2", ""))

        rc_checkout.adapter = TicketAdapter(dataList){

        }
    }
}