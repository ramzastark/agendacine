package mx.asgardroid.agendacine.database

import androidx.room.Database
import androidx.room.RoomDatabase
import mx.asgardroid.agendacine.models.Contact

@Database(entities = [Contact::class], version = 1)
abstract class JournalDatabase : RoomDatabase() {
    abstract fun contactDao(): JournalDao
}