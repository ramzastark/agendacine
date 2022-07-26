package mx.asgardroid.agendacine.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import mx.asgardroid.agendacine.models.Contact


class JournalViewModel : ViewModel() {
    var num: Int = 0

    fun setInt(i: Int) {
        num = i
    }

    fun processContact(contact: Contact) {
        Log.d("MyTest", "Contact: $contact")
    }
}