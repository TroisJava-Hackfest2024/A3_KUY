package com.example.a3kuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a3kuy.databinding.ActivityLoginBinding
import com.example.a3kuy.databinding.ActivityRegisterBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            val email = binding.etEmailLogin.text.toString()
            val password = binding.etPasswordLogin.text.toString()

            if (email.isEmpty()) {
                binding.etEmailLogin.error = "Email Kosong"
                binding.etEmailLogin.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                binding.etPasswordLogin.error = "Password Kosong"
                binding.etPasswordLogin.requestFocus()
                return@setOnClickListener
            }
            if (password.length < 8) {
                binding.etPasswordLogin.error = "Password Minimal terdiri dari 8 Karakter"
                binding.etPasswordLogin.requestFocus()
                return@setOnClickListener
            }
        }

    }
}