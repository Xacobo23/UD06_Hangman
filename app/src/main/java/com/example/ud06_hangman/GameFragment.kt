package com.example.ud06_hangman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.ud06_hangman.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    var _binding: FragmentGameBinding? = null
    val binding get() = _binding!!

    val model :HangmanViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGameBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnNext.setOnClickListener{
            view.findNavController().navigate(R.id.action_gameFragment_to_resultFragment)

        }




        return view
    }
}