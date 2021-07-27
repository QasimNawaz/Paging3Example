package com.qasim.paging3example.ui.detail

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import com.qasim.paging3example.R
import com.qasim.paging3example.base.BaseActivity
import com.qasim.paging3example.data.model.response.ListingResponse
import com.qasim.paging3example.data.model.response.Resource
import com.qasim.paging3example.databinding.ActivityDetailBinding
import com.qasim.paging3example.utils.extensions.observe
import com.qasim.paging3example.utils.inflaters.contentView
import dagger.hilt.android.AndroidEntryPoint
import org.jetbrains.anko.toast

@AndroidEntryPoint
class DetailActivity : BaseActivity() {

    private val binding by contentView<ActivityDetailBinding>(R.layout.activity_detail)
    private val viewModel: DetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (intent.hasExtra("objId")) {
            viewModel.getPixaBayDetail(intent.getIntExtra("objId", 0))
        }
    }

    private fun handlePixabayObserver(status: Resource<ListingResponse>) {
        when (status) {
            is Resource.Loading -> binding.progressBar.visibility = View.VISIBLE
            is Resource.Success -> status.d?.let {
                binding.progressBar.visibility = View.GONE
//                bindListData(recipes = it)
                Log.d("handlePixabayObserver", "${it.hits?.get(0)?.id}")
            }
            is Resource.DataError -> {
                binding.progressBar.visibility = View.GONE
                toast(status.e.message.toString())
                Log.d("handlePixabayObserver", "${status.e.message}")
//                showDataView(false)
//                status.errorCode?.let { recipesListViewModel.showToastMessage(it) }
            }
        }
    }

    override fun observeViewModel() {
        observe(viewModel.response, ::handlePixabayObserver)
    }

}