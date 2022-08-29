package com.example.latihankotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihankotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


/*        binding.textView2.setOnClickListener {
            binding.textView2.text = " halo"
        }

        binding.textView3.setOnClickListener {
            binding.textView3.text = " selamat datang"
        }

        binding.textView4.setOnClickListener {
            binding.textView4.text = " halo bos"
        }*/
    }

}

