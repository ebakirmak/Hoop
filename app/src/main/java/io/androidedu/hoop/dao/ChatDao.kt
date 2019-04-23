package io.androidedu.hoop.dao

import androidx.room.*
import io.androidedu.hoop.entity.ChatEntity

@Dao
interface ChatDao {

    @Insert
    fun insertChat(chatEntity: ChatEntity)

    @Delete
    fun deleteChat(chatEntity: ChatEntity)

    @Update
    fun updateChat(chatEntity: ChatEntity)

    @Query("SELECT * FROM ChatTable where id = :id")
    fun retrieveSingleChat(id: Int): ChatEntity

    @Query("SELECT * FROM ChatTable")
    fun retrieveAllChatList(): List<ChatEntity>

}