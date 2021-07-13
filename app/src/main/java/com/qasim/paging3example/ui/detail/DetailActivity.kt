package com.qasim.paging3example.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.qasim.paging3example.R
import com.qasim.paging3example.databinding.ActivityDetailBinding
import com.qasim.paging3example.databinding.ActivityMainBinding
import com.qasim.paging3example.ui.pagingwithroom.PagingWithRoomViewModel
import com.qasim.paging3example.utils.inflaters.contentView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {

    private val binding by contentView<ActivityDetailBinding>(R.layout.activity_detail)
    private val viewModel: DetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}