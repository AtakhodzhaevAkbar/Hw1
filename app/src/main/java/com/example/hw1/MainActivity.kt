package com.example.hw1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import com.example.hw1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),CounterView {
    private lateinit var binding: ActivityMainBinding
    private val model=CounterModel()
    private val presenter=CounterPresenter(model,this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupClickListener()
        }


    private fun setupClickListener()= with(binding) {
        BtnInc.setOnClickListener {
            presenter.incrementClick()
        }

        BtnDec.setOnClickListener {
            presenter.decrementClick()
        }
    }


    override fun updateCount(newCount: Int)=with(binding) {
        resultTV.text=newCount.toString()
        if (newCount == 10) {
            Toast.makeText(this@MainActivity, "Поздравляем!", Toast.LENGTH_SHORT).show()
        }
        if (newCount == 15) {
            resultTV.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
        }
    }
}