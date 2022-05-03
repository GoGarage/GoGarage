package com.example.gogarage.ui.auth.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gogarage.R
import com.example.gogarage.databinding.FragmentRegisterAuthBinding
import com.example.gogarage.databinding.FragmentRegisterDadosBinding

class RegisterAuthFragment : Fragment() {

    private var _binding: FragmentRegisterAuthBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterAuthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}