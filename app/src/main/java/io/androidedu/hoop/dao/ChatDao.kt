package io.androidedu.hoop.dao

import androidx.room.*
import io.androidedu.hoop.entity.ChatEntity

@Dao
interface ChatDao {

    @Insert
    fun InsertChat(chatEntity: ChatEntity)

    @Delete
    fun DeleteChat(chatEntity: ChatEntity)

    @Update
    fun UpdateChat(chatEntity: ChatEntity)

    @Query("SELECT * FROM ChatTable where id = :id")
    fun RetrieveSingleChat(id: Int): ChatEntity

    @Query("SELECT * FROM ChatTable")
    fun RetrieveAllChatList(): List<ChatEntity>

}