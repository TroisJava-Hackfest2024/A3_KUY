package com.example.a3kuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a3kuy.databinding.ActivityRegisterBinding
import kotlinx.android.synthetic.main.activity_login.btn_login
import kotlinx.android.synthetic.main.activity_register.btn_register
import kotlinx.android.synthetic.main.activity_register.tv_to_login

class RegisterActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener {
            val email = binding.etEmailRegister.text.toString()
            val password = binding.etPasswordRegister.text.toString()

            if (email.isEmpty()) {
                binding.etEmailRegister.error = "Email Kosong"
                binding.etEmailRegister.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                binding.etPasswordRegister.error = "Password Kosong"
                binding.etPasswordRegister.requestFocus()
                return@setOnClickListener
            }
            if (password.length < 8) {
                binding.etPasswordRegister.error = "Password Minimal terdiri dari 8 Karakter"
                binding.etPasswordRegister.requestFocus()
                return@setOnClickListener
            }

        }
    }
}