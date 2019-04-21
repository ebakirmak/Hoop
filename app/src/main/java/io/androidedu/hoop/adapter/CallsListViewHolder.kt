package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import io.androidedu.hoop.R
import io.androidedu.hoop.model.CallsModel
import kotlinx.android.synthetic.main.adapter_item_calls_list.view.*

class CallsListViewHolder(parent: ViewGroup) :
        RecyclerView.ViewHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.adapter_item_calls_list,
                        parent,
                        false
                )) {
    private val circleImageUserProfile: CircleImageView by lazy { itemView.imgUserProfile }
    private val txtUserName: TextView by lazy { itemView.txtUserName }
    private val imgCallType: ImageView by lazy { itemView.imgCallType }
    private val txtCallCount: TextView by lazy { itemView.txtCallCount }
    private val txtCallDate: TextView by lazy { itemView.txtCallDate }
    private val imgCommunicationType: ImageView by lazy { itemView.imgCommunicationType }

    fun bind(callsModel: CallsModel) {
        circleImageUserProfile.setBackgroundResource(callsModel.UserProfilePhoto)
        txtUserName.text = callsModel.UserName
        imgCallType.setBackgroundResource(callsModel.CallType)
        txtCallCount.text = "( " + callsModel.CallCount.toString() + " )"
        txtCallDate.text = callsModel.CallDate
        imgCommunicationType.setBackgroundResource(callsModel.CommunicationType)
    }
}