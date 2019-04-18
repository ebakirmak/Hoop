package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.model.StatusModel
import kotlinx.android.synthetic.main.adapter_item_status_list.view.*


class StatusListViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.adapter_item_status_list,
            parent,
            false
        )
    ) {

    private val imgProfile = itemView.imgUserProfile
    private val txtUserName = itemView.txtUserName
    private val txtDate = itemView.txtDate

    init {

    }

    fun bind(statusModel: StatusModel, onItemClickListener: (statusModel: StatusModel) -> Unit) {
        imgProfile.setBackgroundResource(statusModel.profilePhoto)
        txtUserName.text = statusModel.userName
        txtDate.text = statusModel.date

        itemView.setOnClickListener {
            onItemClickListener(statusModel)
        }
    }
}