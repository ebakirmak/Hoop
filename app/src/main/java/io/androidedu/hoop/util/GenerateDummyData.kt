package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.model.ChatModel
import io.androidedu.hoop.model.StatusModel

object GenerateDummyData {

    fun getDummyChatList(): ArrayList<ChatModel> = ArrayList<ChatModel>().apply {
        val chatModel = ChatModel(
            R.drawable.ic_person,
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

    fun getDummyStatusList(): ArrayList<StatusModel> = ArrayList<StatusModel>().apply {
        val statusModel = StatusModel(
            R.drawable.ic_person,
            "Madam Curie",
            "Bugün 20:46"
        )

        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
    }

}