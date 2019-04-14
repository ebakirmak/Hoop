package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.model.ChatModel

object GenerateDummyData {

    fun getDummyChatList(): ArrayList<ChatModel> = ArrayList<ChatModel>().apply {
        val chatModel = ChatModel(
            R.drawable.ic_camera_black,
            "Emre Berk AKIRMAK",
            "SOLID",
            "14.04.2019"
        )
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
    }

}