package com.qasim.paging3example.ui.detail

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.qasim.paging3example.data.repo.PixabayRepo

class DetailViewModel @ViewModelInject constructor(
    private val pixabayRepo: PixabayRepo
) : ViewModel() {

}