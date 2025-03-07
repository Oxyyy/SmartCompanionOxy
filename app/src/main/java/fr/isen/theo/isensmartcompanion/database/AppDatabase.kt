package fr.isen.theo.isensmartcompanion.database

import androidx.room.Database
import androidx.room.RoomDatabase
import fr.isen.theo.isensmartcompanion.dao.MessageDao
import fr.isen.theo.isensmartcompanion.models.Message

@Database(entities = [Message::class], version = 2, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun messageDao(): MessageDao
}