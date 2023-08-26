package com.example.praktikumpemrogramanbergerakandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.praktikumpemrogramanbergerakandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

            buttonLogin.setOnClickListener {
                val uname : String = usernameInput?.text.toString()
                val pwd : String = userPassword.text.toString()

                if (uname.isNotEmpty() && pwd.isNotEmpty()) {
                    Toast.makeText(this@MainActivity, "Login Sukses", Toast.LENGTH_SHORT).show()
                }

            }
        }
    }
}