package com.qasim.paging3example.ui.pagingwithroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.qasim.paging3example.R
import com.qasim.paging3example.adapter.LoadingAdapter
import com.qasim.paging3example.adapter.PixabayAdapter
import com.qasim.paging3example.data.model.PixabayObj
import com.qasim.paging3example.databinding.FragmentPagingWithRoomBinding
import com.qasim.paging3example.ui.detail.DetailActivity
import com.qasim.paging3example.utils.inflaters.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.jetbrains.anko.support.v4.startActivity

@AndroidEntryPoint
class PagingWithRoomFragment : Fragment(R.layout.fragment_paging_with_room) {

    private val listener = object : PixabayAdapter.PixbayAdapterListener {
        override fun onPixbayItemClicked(item: PixabayObj) {
            startActivity<DetailActivity>(
                "objId" to item.id
            )
        }
    }

    private val viewModel: PagingWithRoomViewModel by viewModels()
    private val binding by viewBinding(FragmentPagingWithRoomBinding::bind)
    private val pixabayAdapter by lazy {
        PixabayAdapter(listener)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        loadData()
    }

    private fun loadData() {
        lifecycleScope.launch {
            viewModel.fetchPixabayList().collectLatest { pagingData ->
                pixabayAdapter.submitData(pagingData)
            }
        }
    }

    private fun initViews() {
        val gridLayoutManager = GridLayoutManager(requireContext(), 2)
        binding.listRecyclerView.adapter = pixabayAdapter
        binding.listRecyclerView.layoutManager =
            gridLayoutManager
        binding.listRecyclerView.adapter = pixabayAdapter.withLoadStateFooter(
            footer = LoadingAdapter { pixabayAdapter.retry() }
        )
        gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                // If progress will be shown then span size will be 1 otherwise it will be 2
                return if (pixabayAdapter.getItemViewType(position) === PixabayAdapter.LOADING_ITEM) 1 else 2
            }
        }
    }
}