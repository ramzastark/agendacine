package mx.asgardroid.agendacine.ui.agenda

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import mx.asgardroid.agendacine.databinding.FragmentAddContactBinding
import mx.asgardroid.agendacine.models.Contact
import mx.asgardroid.agendacine.viewmodels.JournalViewModel

class AddContactFragment : Fragment() {

    private lateinit var binding: FragmentAddContactBinding
    private lateinit var journalViewModel: JournalViewModel
    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddContactBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        journalViewModel = ViewModelProvider(this).get(JournalViewModel::class.java)

        binding.btnProcess.setOnClickListener {
            if (!binding.etName.text.isNullOrBlank()) {
                count++
            }
            if (!binding.etLastName.text.isNullOrBlank()) {
                count++
            }
            if (!binding.etCelphone.text.isNullOrBlank()) {
                count++
            }
            if (!binding.etAddress.text.isNullOrBlank()) {
                count++
            }
            if (!binding.etMail.text.isNullOrBlank()) {
                count++
            }

            if (count == 5) {
                journalViewModel.processContact(
                    Contact(
                        udi = 0,
                        name = binding.etName.text.toString(),
                        lastName = binding.etLastName.text.toString(),
                        phone = binding.etCelphone.text.toString(),
                        address = binding.etAddress.text.toString(),
                        email = binding.etMail.text.toString()
                    )
                )
                Toast.makeText(
                    context, "Procesando, espere un momento por favor",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                count = 0
                Toast.makeText(
                    context, "Verifica que no existan campos vacios",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}