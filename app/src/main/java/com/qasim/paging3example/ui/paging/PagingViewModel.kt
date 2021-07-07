package com.qasim.paging3example.ui.paging

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.qasim.paging3example.adapter.item.PixabayItem
import com.qasim.paging3example.data.repo.PixabayRepo
import kotlinx.coroutines.flow.Flow

class PagingViewModel @ViewModelInject constructor(
    private val pixabayRepo: PixabayRepo
) : ViewModel() {

    fun fetchPixabayList(): Flow<PagingData<PixabayItem>> {
        return pixabayRepo.fetchPixabay().cachedIn(viewModelScope)
    }

}