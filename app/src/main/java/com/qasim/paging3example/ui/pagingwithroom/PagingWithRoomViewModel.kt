package com.qasim.paging3example.ui.pagingwithroom

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.qasim.paging3example.data.model.PixabayObj
import com.qasim.paging3example.data.repo.PixabayRepo
import kotlinx.coroutines.flow.Flow

class PagingWithRoomViewModel @ViewModelInject constructor(
    private val pixabayRepo: PixabayRepo
) : ViewModel() {

    fun fetchPixabayList(): Flow<PagingData<PixabayObj>> {
        return pixabayRepo.fetchPixabayMediator().cachedIn(viewModelScope)
    }
}