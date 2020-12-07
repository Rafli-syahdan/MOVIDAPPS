package com.prjctbyrafli.movid.home.tiket

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import com.prjctbyrafli.movid.R
import com.prjctbyrafli.movid.home.dashboard.ComingSoonAdapter
import com.prjctbyrafli.movid.model.Film
import com.prjctbyrafli.movid.utils.Preferences
import kotlinx.android.synthetic.main.fragment_ticket.*

class TicketFragment : Fragment() {

    private lateinit var preferences: Preferences
    private lateinit var mDatabase: DatabaseReference
    private var datalist = ArrayList<Film>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ticket, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        preferences = Preferences(context!!)
        mDatabase = FirebaseDatabase.getInstance().getReference("Film")

        rc_ticket.layoutManager = LinearLayoutManager(context)
        getData()
    }

    private fun getData() {
        mDatabase.addValueEventListener(object : ValueEventListener{
            override fun onCancelled(p0: DatabaseError) {
                Toast.makeText(context, ""+p0.message, Toast.LENGTH_LONG).show()
            }

            override fun onDataChange(p0: DataSnapshot) {
                datalist.clear()
                for (getdataSnapshot in p0.children){
                    val film = getdataSnapshot.getValue(Film::class.java)
                    datalist.add(film!!)
                }

                rc_ticket.adapter = ComingSoonAdapter(datalist){
                    var intent = Intent(context, TicketActivity::class.java).putExtra("data", it)
                    startActivity(intent)
                }

                tv_total.setText("${datalist.size} Movies")
            }

        })
    }

}