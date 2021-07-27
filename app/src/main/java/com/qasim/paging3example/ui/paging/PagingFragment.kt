package com.qasim.paging3example.ui.paging

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.whenResumed
import androidx.recyclerview.widget.GridLayoutManager
import com.qasim.paging3example.R
import com.qasim.paging3example.adapter.item.PixabayItem
import com.qasim.paging3example.adapter.pagedlist.PixabayPagedListGroup
import com.qasim.paging3example.data.model.PixabayObj
import com.qasim.paging3example.databinding.FragmentPagingBinding
import com.qasim.paging3example.ui.detail.DetailActivity
import com.qasim.paging3example.utils.inflaters.viewBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.jetbrains.anko.support.v4.startActivity

@AndroidEntryPoint
class PagingFragment : Fragment(R.layout.fragment_paging) {

    private val viewModel: PagingViewModel by viewModels()
    private val binding by viewBinding(FragmentPagingBinding::bind)
    private var mAdapter: GroupAdapter<GroupieViewHolder>? = null
    private val pagedListGroup =
        PixabayPagedListGroup()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        loadData()
    }

    private fun loadData() {
        lifecycleScope.launch {
            lifecycle.whenResumed {
                viewModel.fetchPixabayList().collectLatest { pagingData ->
                    pagedListGroup.submitList(this@PagingFragment.lifecycle, pagingData)
                }
            }
        }
    }

    private fun initViews() {
        val gridLayoutManager = GridLayoutManager(requireContext(), 2)
        mAdapter = GroupAdapter<GroupieViewHolder>().apply {
            add(pagedListGroup)
        }
        binding.listRecyclerView.apply {
            layoutManager =
                gridLayoutManager
            adapter = mAdapter
        }
        mAdapter!!.setOnItemClickListener { item, view ->
            when (item) {
                is PixabayItem -> {
                    val pixabayObj
                            : PixabayObj = item.pixabayModel as PixabayObj
                    startActivity<DetailActivity>(
                        "objId" to pixabayObj.id
                    )
                }
            }
        }
    }
}