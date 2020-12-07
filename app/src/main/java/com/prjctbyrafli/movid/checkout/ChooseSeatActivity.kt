package com.prjctbyrafli.movid.checkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.prjctbyrafli.movid.DetailActivity
import com.prjctbyrafli.movid.R
import com.prjctbyrafli.movid.model.Checkout
import com.prjctbyrafli.movid.model.Film
import kotlinx.android.synthetic.main.activity_choose_seat.*

class ChooseSeatActivity : AppCompatActivity() {

    var statusA1:Boolean = false
    var statusA2:Boolean = false
    var statusA3:Boolean = false
    var statusA4:Boolean = false
    var statusB1:Boolean = false
    var statusB2:Boolean = false
    var statusB3:Boolean = false
    var statusB4:Boolean = false
    var statusC1:Boolean = false
    var statusC2:Boolean = false
    var statusC3:Boolean = false
    var statusC4:Boolean = false
    var statusD1:Boolean = false
    var statusD2:Boolean = false
    var statusD3:Boolean = false
    var statusD4:Boolean = false
    var total:Int = 0

    private var dataList = ArrayList<Checkout>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_seat)

        val data = intent.getParcelableExtra<Film>("data")
        tv_kursi.text = data.judul

        a1.setOnClickListener{
            if (statusA1) {
                a1.setImageResource(R.drawable.ic_rectangle_empty)
                statusA1 = false
                total -= 1
                beliTiket(total)
            } else {
                a1.setImageResource(R.drawable.ic_rectangle_selected)
                statusA1 = true
                total += 1
                beliTiket(total)

                val data = Checkout("A1", "50000")
                dataList.add(data)
            }
        }

        a2.setOnClickListener{
            if (statusA2) {
                a2.setImageResource(R.drawable.ic_rectangle_empty)
                statusA2 = false
                total -= 1
                beliTiket(total)
            } else {
                a2.setImageResource(R.drawable.ic_rectangle_selected)
                statusA2 = true
                total += 1
                beliTiket(total)

                val data = Checkout("A2", "50000")
                dataList.add(data)
            }
        }

        a3.setOnClickListener{
            if (statusA3) {
                a3.setImageResource(R.drawable.ic_rectangle_empty)
                statusA3 = false
                total -= 1
                beliTiket(total)
            } else {
                a3.setImageResource(R.drawable.ic_rectangle_selected)
                statusA3 = true
                total += 1
                beliTiket(total)

                val data = Checkout("A3", "50000")
                dataList.add(data)
            }
        }

        a4.setOnClickListener{
            if (statusA4) {
                a4.setImageResource(R.drawable.ic_rectangle_empty)
                statusA4 = false
                total -= 1
                beliTiket(total)
            } else {
                a4.setImageResource(R.drawable.ic_rectangle_selected)
                statusA4 = true
                total += 1
                beliTiket(total)

                val data = Checkout("A4", "50000")
                dataList.add(data)
            }
        }

        b1.setOnClickListener{
            if (statusB1) {
                b1.setImageResource(R.drawable.ic_rectangle_empty)
                statusB1 = false
                total -= 1
                beliTiket(total)
            } else {
                b1.setImageResource(R.drawable.ic_rectangle_selected)
                statusB1 = true
                total += 1
                beliTiket(total)

                val data = Checkout("B1", "50000")
                dataList.add(data)
            }
        }

        b2.setOnClickListener{
            if (statusB2) {
                b2.setImageResource(R.drawable.ic_rectangle_empty)
                statusB2 = false
                total -= 1
                beliTiket(total)
            } else {
                b2.setImageResource(R.drawable.ic_rectangle_selected)
                statusB2 = true
                total += 1
                beliTiket(total)

                val data = Checkout("B2", "50000")
                dataList.add(data)
            }
        }

        b3.setOnClickListener{
            if (statusB3) {
                b3.setImageResource(R.drawable.ic_rectangle_empty)
                statusB3 = false
                total -= 1
                beliTiket(total)
            } else {
                b3.setImageResource(R.drawable.ic_rectangle_selected)
                statusB3 = true
                total += 1
                beliTiket(total)

                val data = Checkout("B3", "50000")
                dataList.add(data)
            }
        }

        b4.setOnClickListener{
            if (statusB4) {
                b4.setImageResource(R.drawable.ic_rectangle_empty)
                statusB4 = false
                total -= 1
                beliTiket(total)
            } else {
                b4.setImageResource(R.drawable.ic_rectangle_selected)
                statusB4 = true
                total += 1
                beliTiket(total)

                val data = Checkout("B4", "50000")
                dataList.add(data)
            }
        }

        c1.setOnClickListener{
            if (statusC1) {
                c1.setImageResource(R.drawable.ic_rectangle_empty)
                statusC1 = false
                total -= 1
                beliTiket(total)
            } else {
                c1.setImageResource(R.drawable.ic_rectangle_selected)
                statusC1 = true
                total += 1
                beliTiket(total)

                val data = Checkout("C1", "50000")
                dataList.add(data)
            }
        }

        c2.setOnClickListener{
            if (statusC2) {
                c2.setImageResource(R.drawable.ic_rectangle_empty)
                statusC2 = false
                total -= 1
                beliTiket(total)
            } else {
                c2.setImageResource(R.drawable.ic_rectangle_selected)
                statusC2 = true
                total += 1
                beliTiket(total)

                val data = Checkout("C2", "50000")
                dataList.add(data)
            }
        }

        c3.setOnClickListener{
            if (statusC3) {
                c3.setImageResource(R.drawable.ic_rectangle_empty)
                statusC3 = false
                total -= 1
                beliTiket(total)
            } else {
                c3.setImageResource(R.drawable.ic_rectangle_selected)
                statusC3 = true
                total += 1
                beliTiket(total)

                val data = Checkout("C3", "50000")
                dataList.add(data)
            }
        }

        c4.setOnClickListener{
            if (statusC4) {
                c4.setImageResource(R.drawable.ic_rectangle_empty)
                statusC4 = false
                total -= 1
                beliTiket(total)
            } else {
                c4.setImageResource(R.drawable.ic_rectangle_selected)
                statusC4 = true
                total += 1
                beliTiket(total)

                val data = Checkout("C4", "50000")
                dataList.add(data)
            }
        }

        d1.setOnClickListener{
            if (statusD1) {
                d1.setImageResource(R.drawable.ic_rectangle_empty)
                statusD1 = false
                total -= 1
                beliTiket(total)
            } else {
                d1.setImageResource(R.drawable.ic_rectangle_selected)
                statusD1 = true
                total += 1
                beliTiket(total)

                val data = Checkout("D1", "50000")
                dataList.add(data)
            }
        }

        d2.setOnClickListener{
            if (statusD2) {
                d2.setImageResource(R.drawable.ic_rectangle_empty)
                statusD2 = false
                total -= 1
                beliTiket(total)
            } else {
                d2.setImageResource(R.drawable.ic_rectangle_selected)
                statusD2 = true
                total += 1
                beliTiket(total)

                val data = Checkout("D2", "50000")
                dataList.add(data)
            }
        }

        d3.setOnClickListener{
            if (statusD3) {
                d3.setImageResource(R.drawable.ic_rectangle_empty)
                statusD3 = false
                total -= 1
                beliTiket(total)
            } else {
                d3.setImageResource(R.drawable.ic_rectangle_selected)
                statusD3 = true
                total += 1
                beliTiket(total)

                val data = Checkout("D3", "50000")
                dataList.add(data)
            }
        }

        d4.setOnClickListener{
            if (statusD4) {
                d4.setImageResource(R.drawable.ic_rectangle_empty)
                statusD4 = false
                total -= 1
                beliTiket(total)
            } else {
                d4.setImageResource(R.drawable.ic_rectangle_selected)
                statusD4 = true
                total += 1
                beliTiket(total)

                val data = Checkout("D4", "50000")
                dataList.add(data)
            }
        }

        btn_home.setOnClickListener {
            val intent = Intent(this, CheckoutActivity::class.java)
                .putExtra("data", dataList)
                .putExtra("datas", data)
            startActivity(intent)
        }

        iv_back.setOnClickListener {
            finish()
        }
    }

    private fun beliTiket(total: Int) {
        if (total == 0){
            btn_home.setText("Beli Tiket")
            btn_home.visibility = View.INVISIBLE
        } else {
            btn_home.setText("Beli Tiket ("+total+")")
            btn_home.visibility = View.VISIBLE
        }
    }
}