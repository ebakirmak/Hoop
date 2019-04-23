package io.androidedu.hoop.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.ChatListAdapter
import io.androidedu.hoop.dao.ChatDao
import io.androidedu.hoop.database.AppDatabase
import io.androidedu.hoop.entity.ChatEntity
import io.androidedu.hoop.model.ChatModel
import kotlinx.android.synthetic.main.fragment_chat.*
import kotlin.concurrent.thread


class ChatFragment : Fragment() {
    private var dbInstance: AppDatabase? = null
    private var chatDao: ChatDao? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dbInstance = AppDatabase.getInstance(activity!!)
        chatDao = dbInstance!!.getChatDao()
        thread(start = true) {
            insertChatDataToDatabase()
        }

    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        thread(start = true) {

            with(recycleChatList) {
                adapter = ChatListAdapter(retrieveChatDataFromDatabase()) { chatModel ->
                    Toast.makeText(activity, chatModel.userName, Toast.LENGTH_LONG).show()
                }
                layoutManager = LinearLayoutManager(activity)
            }
        }
    }

    private fun insertChatDataToDatabase() {
        if (chatDao?.retrieveAllChatList()!!.isEmpty()) {

            val chatEntityTeacher = ChatEntity(ProfilePhoto = R.drawable.ic_person,
                    UserName = "Gökhan ÖZTÜRK",
                    UserMessage = "5.500 Kazanmak!",
                    ChatDate = "22 Nisan 2019")

            val chatEntityFirst = ChatEntity(ProfilePhoto = R.drawable.ic_person,
                    UserName = "Emre Berk AKIRMAK",
                    UserMessage = "Mesaj 1",
                    ChatDate = "22 Nisan 2019")

            val chatEntitySecond = ChatEntity(ProfilePhoto = R.drawable.ic_person,
                    UserName = "Cansu Yeksan",
                    UserMessage = "Mesaj 2",
                    ChatDate = "20 Nisan 2019")

            val chatEntityThird = ChatEntity(ProfilePhoto = R.drawable.ic_person,
                    UserName = "Saltuk Buğra Han Kandemir",
                    UserMessage = "Mesaj 3",
                    ChatDate = "21 Nisan 2019")

            val chatEntityFourth = ChatEntity(ProfilePhoto = R.drawable.ic_person,
                    UserName = "Yaprak Mertek",
                    UserMessage = "Mesaj 4",
                    ChatDate = "19 Nisan 2019")

            val chatEntityFifth = ChatEntity(ProfilePhoto = R.drawable.ic_person,
                    UserName = "Esra",
                    UserMessage = "Mesaj 5",
                    ChatDate = "16 Nisan 2019")

            val chatEntitySixth = ChatEntity(ProfilePhoto = R.drawable.ic_person,
                    UserName = "Emirhan",
                    UserMessage = "Mesaj 6",
                    ChatDate = "20 Nisan 2019")


            chatDao?.insertChat(chatEntityTeacher)
            chatDao?.insertChat(chatEntityFirst)
            chatDao?.insertChat(chatEntitySecond)
            chatDao?.insertChat(chatEntityThird)
            chatDao?.insertChat(chatEntityFourth)
            chatDao?.insertChat(chatEntityFifth)
            chatDao?.insertChat(chatEntitySixth)
        }

    }

    private fun retrieveChatDataFromDatabase(): ArrayList<ChatModel> {

        val chatModelList: ArrayList<ChatModel> = ArrayList()
        val chatEntityList = chatDao?.retrieveAllChatList()
        chatEntityList?.forEach {
            val chatModel = ChatModel(it.ProfilePhoto, it.UserName, it.UserMessage, it.ChatDate)
            chatModelList.add(chatModel)
        }

        if (chatModelList.isEmpty()) {
            val chatModel = ChatModel(R.drawable.ic_camera_black, "null", "null", "null")
            chatModelList.add(chatModel)
        }
        return chatModelList
    }

    companion object {
        @JvmStatic
        fun newInstance() = ChatFragment()
    }
}
