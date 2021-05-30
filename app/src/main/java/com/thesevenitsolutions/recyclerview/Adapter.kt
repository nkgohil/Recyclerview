package com.thesevenitsolutions.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class Adapter : RecyclerView.Adapter<Adapter.AdapterViewHolder>() {

    private var sizelist: ArrayList<simdetailspojo>? = arrayListOf()
    inner class AdapterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var tvtext:TextView = itemView.findViewById(R.id.tvtitle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
      val itemView =LayoutInflater.from(parent.context).inflate(R.layout.rv_row,parent,false)
        return AdapterViewHolder(itemView)
    }

    fun addAllItems(items: ArrayList<simdetailspojo>){
        sizelist!!.clear()
        sizelist!!.addAll(items)
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        holder.tvtext.text = sizelist!![position].text
    }

    override fun getItemCount(): Int {
            return sizelist!!.size
    }
}