package com.qasim.paging3example.ui.pagingwithroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.qasim.paging3example.R
import com.qasim.paging3example.adapter.LoadingAdapter
import com.qasim.paging3example.adapter.PixabayAdapter
import com.qasim.paging3example.databinding.FragmentPagingBinding
import com.qasim.paging3example.databinding.FragmentPagingWithRoomBinding
import com.qasim.paging3example.ui.paging.PagingViewModel
import com.qasim.paging3example.utils.inflaters.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PagingWithRoomFragment : Fragment(R.layout.fragment_paging_with_room) {

    private val viewModel: PagingWithRoomViewModel by viewModels()
    private val binding by viewBinding(FragmentPagingWithRoomBinding::bind)
    private val redditAdapter = PixabayAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        loadData()
    }

    private fun loadData() {
        lifecycleScope.launch {
            viewModel.fetchPixabayList().collectLatest { pagingData ->
                redditAdapter.submitData(pagingData)
            }
        }
    }

    private fun initViews() {
        val gridLayoutManager = GridLayoutManager(requireContext(), 2)
        binding.listRecyclerView.adapter = redditAdapter
        binding.listRecyclerView.layoutManager =
            gridLayoutManager
        binding.listRecyclerView.adapter = redditAdapter.withLoadStateFooter(
            footer = LoadingAdapter { redditAdapter.retry() }
        )
        gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                // If progress will be shown then span size will be 1 otherwise it will be 2
                return if (redditAdapter.getItemViewType(position) === PixabayAdapter.LOADING_ITEM) 1 else 2
            }
        }
    }
}