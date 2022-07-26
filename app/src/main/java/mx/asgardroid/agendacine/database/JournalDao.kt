package mx.asgardroid.agendacine.database

import androidx.room.*
import mx.asgardroid.agendacine.models.Contact

@Dao
interface JournalDao {
    @Query("SELECT * FROM Contact")
    fun getAll(): List<Contact>

    @Insert
    fun insertAll(vararg contact: Contact)

    @Delete
    fun delete(vararg contact: Contact)

    @Update
    fun updateContact(vararg contact: Contact)
}