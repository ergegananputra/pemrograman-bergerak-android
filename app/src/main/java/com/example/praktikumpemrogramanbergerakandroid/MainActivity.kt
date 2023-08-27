package com.example.praktikumpemrogramanbergerakandroid

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.praktikumpemrogramanbergerakandroid.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

            buttonLogin.setOnClickListener {
                val uname : String = edtUsername.text.toString()
                val pwd : String = edtPassword.text.toString()


                if (uname.isEmpty() || pwd.isEmpty()) {
                    val snackbar = Snackbar.make(
                        it,
                        R.string.login_blank,
                        Snackbar.LENGTH_SHORT
                    )
                    snackbar.setTextColor(Color.WHITE)
                    snackbar.setBackgroundTint(Color.argb(255, 38, 46, 57))

                    snackbar.show()

                } else {
                    val snackbar = Snackbar.make(
                        it,
                        R.string.login_success,
                        Snackbar.LENGTH_SHORT
                        )
                    snackbar.setTextColor(Color.WHITE)
                    snackbar.setBackgroundTint(Color.argb(255, 38, 46, 57))

                    snackbar.show()
                }

            }
        }
    }
}