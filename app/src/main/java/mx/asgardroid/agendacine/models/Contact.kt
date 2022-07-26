package mx.asgardroid.agendacine.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    @PrimaryKey val udi: Int,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "last_name") var lastName: String,
    @ColumnInfo(name = "phone") var phone: String,
    @ColumnInfo(name = "address") var address: String,
    @ColumnInfo(name = "email") var email: String
)