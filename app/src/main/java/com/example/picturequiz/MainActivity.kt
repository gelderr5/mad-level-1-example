package com.example.picturequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.picturequiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }

    /**
     * Method that checks if the submitted answer is correct
     */
    private fun checkAnswer() {
        val answer = binding.etAnswer.text.toString()

        if (answer == getString(R.string.giraffe))
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
    }
}
