package com.qasim.paging3example.utils

import androidx.recyclerview.widget.DiffUtil
import com.qasim.paging3example.adapter.item.PixabayItem
import com.qasim.paging3example.data.model.PixabayObj

class DiffUtilCallBack : DiffUtil.ItemCallback<PixabayObj>() {
    override fun areItemsTheSame(oldItem: PixabayObj, newItem: PixabayObj): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: PixabayObj, newItem: PixabayObj): Boolean {
        return equals(oldItem, newItem)
    }

    fun equals(obj1: PixabayObj, obj2: PixabayObj): Boolean {
        return obj1.id == obj2.id

    }
}