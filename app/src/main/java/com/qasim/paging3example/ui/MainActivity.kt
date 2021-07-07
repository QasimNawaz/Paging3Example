package com.qasim.paging3example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qasim.paging3example.R
import com.qasim.paging3example.databinding.ActivityMainBinding
import com.qasim.paging3example.utils.inflaters.contentView
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private val binding by contentView<ActivityMainBinding>(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.exampleOne.setOnClickListener {
            startActivity<DataActivity>(
                "data" to 1
            )
        }
        binding.exampleTwo.setOnClickListener {
            startActivity<DataActivity>(
                "data" to 2
            )
        }
    }
}