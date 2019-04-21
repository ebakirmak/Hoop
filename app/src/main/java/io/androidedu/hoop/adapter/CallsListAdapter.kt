package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.model.CallsModel

class CallsListAdapter(val callsList: ArrayList<CallsModel>) : RecyclerView.Adapter<CallsListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallsListViewHolder = CallsListViewHolder(parent)

    override fun getItemCount(): Int = callsList.size

    override fun onBindViewHolder(holder: CallsListViewHolder, position: Int) {
        holder.bind(callsList[position])
    }

}