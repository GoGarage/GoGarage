package com.example.gogarage.ui.auth.recover

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gogarage.R
import com.example.gogarage.databinding.FragmentRecoverEmailBinding
import com.example.gogarage.databinding.FragmentRecoverPasswordBinding

class RecoverPasswordFragment : Fragment() {
    private var _binding: FragmentRecoverPasswordBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecoverPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}