package com.example.adityamadjidloginregister.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.adityamadjidloginregister.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        setupRegisterButton()

        return root
    }

    private fun setupRegisterButton() {
        binding.btnRegister.setOnClickListener {
            val name = binding.inputName.text.toString().trim()
            val email = binding.inputEmail.text.toString().trim()
            val password = binding.inputPassword.text.toString().trim()

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(requireContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Registering: $name", Toast.LENGTH_SHORT).show()
                // Tambahkan logika untuk memproses registrasi di sini
            }
        }

        binding.textHaveAccount.setOnClickListener {
            Toast.makeText(requireContext(), "Navigate to Login", Toast.LENGTH_SHORT).show()
            // Tambahkan navigasi ke LoginFragment di sini jika diperlukan
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
