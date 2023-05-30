package com.example.navigation


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val list : List<Model>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.history_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val Hdata = list[position]
        holder.balanceView.text = "You receive ${Hdata.balance}"
        holder.senderView.text = " From ${Hdata.sender}"
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    class ViewHolder(view : View): RecyclerView.ViewHolder(view){
        val balanceView = view.findViewById<TextView>(R.id.balance)
        val senderView = view.findViewById<TextView>(R.id.sender)
    }
}