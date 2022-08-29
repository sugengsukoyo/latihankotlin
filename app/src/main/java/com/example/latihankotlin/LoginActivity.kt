package com.example.latihankotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.latihankotlin.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    //private lateinit var tvLoginTitle: TextView
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        with(binding) {
            tvLoginTitle.setOnClickListener {

                Toast.makeText(this@LoginActivity, "click", Toast.LENGTH_SHORT).show()

                val intentDial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "123456789"))
                startActivity(intentDial)

            }

           btnLogin.setOnClickListener {

                var username = username.editText?.text.toString()
                var pasword =  pasword.editText?.text.toString()
                Toast.makeText(this@LoginActivity, "$username $pasword" , Toast.LENGTH_SHORT).show()


            }

        }




    }
}