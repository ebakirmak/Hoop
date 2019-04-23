package io.androidedu.hoop.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ChatTable")
data class ChatEntity(
        @PrimaryKey(autoGenerate = true)
        val id: Int = 0,

        @ColumnInfo(name = "ProfilePhoto")
        val ProfilePhoto: Int,

        @ColumnInfo(name = "UserName")
        val UserName: String,

        @ColumnInfo(name = "UserMessage")
        val UserMessage: String,

        @ColumnInfo(name = "ChatDate")
        val ChatDate: String
)