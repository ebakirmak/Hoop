package io.androidedu.hoop.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.androidedu.hoop.dao.ChatDao
import io.androidedu.hoop.entity.ChatEntity

@Database(entities = [ChatEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getChatDao(): ChatDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            AppDatabase::class.java,
                            "HoopDB")
                            .fallbackToDestructiveMigration()
                            .build()
                }
            }
            return INSTANCE
        }
    }

}