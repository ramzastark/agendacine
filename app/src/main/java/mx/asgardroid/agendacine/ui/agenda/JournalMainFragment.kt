package mx.asgardroid.agendacine.ui.agenda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import mx.asgardroid.agendacine.R
import mx.asgardroid.agendacine.databinding.FragmentJournalMainBinding

class JournalMainFragment : Fragment() {

    private lateinit var binding: FragmentJournalMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentJournalMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNewContect.setOnClickListener {
            findNavController().navigate(R.id.action_agendaMainFragment_to_addContactFragment)
        }
    }
}