package com.example.manypages

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.manypages.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.done.setOnClickListener {
            val intent = Intent()
            val age = binding.ageEt.text.toString()
            intent.putExtra("age",age)
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}