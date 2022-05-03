package com.example.gogarage.ui.auth.recover

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gogarage.R
import com.example.gogarage.databinding.FragmentRecoverEmailBinding
import com.example.gogarage.databinding.FragmentRegisterAuthBinding

class RecoverEmailFragment : Fragment() {
    private var _binding: FragmentRecoverEmailBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecoverEmailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}