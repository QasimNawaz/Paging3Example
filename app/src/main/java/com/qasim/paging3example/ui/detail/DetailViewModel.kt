package com.qasim.paging3example.ui.detail

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.qasim.paging3example.data.datasource.DataRepositorySource
import com.qasim.paging3example.data.model.response.ListingResponse
import com.qasim.paging3example.data.model.response.Resource
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class DetailViewModel @ViewModelInject constructor(
    private val dataRepositorySource: DataRepositorySource
) : ViewModel() {

    private val _response = MutableLiveData<Resource<ListingResponse>>()
    val response: LiveData<Resource<ListingResponse>> get() = _response

    fun getPixaBayDetail(intExtra: Int) {
        viewModelScope.launch {
            _response.value = Resource.Loading()
            dataRepositorySource.requestPixaBayDetail(intExtra).collect {
                _response.value = it
            }
        }
    }

}