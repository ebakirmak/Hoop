package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.model.ChatModel
import kotlinx.android.synthetic.main.adapter_item_chat_list.view.*

class ChatListViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.adapter_item_chat_list,
            parent,
            false
        )
    ) {
    private val imgProfile = itemView.imgUserProfile
    private val txtUserName = itemView.txtUserName
    private val txtUserMessage = itemView.txtUserMessage
    private val txtDate = itemView.txtDate

    init {

    }

    fun bind(chatModel: ChatModel, onItemClickListener: (chatModel: ChatModel) -> Unit) {
        imgProfile.setBackgroundResource(chatModel.profilePhoto)
        txtUserName.text = chatModel.userName
        txtUserMessage.text = chatModel.userMessage
        txtDate.text = chatModel.date

        itemView.setOnClickListener {
            onItemClickListener(chatModel)
        }
    }

}