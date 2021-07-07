package com.qasim.paging3example.utils

import androidx.recyclerview.widget.DiffUtil
import com.qasim.paging3example.data.model.PixabayObj

class DiffUtilCallBack : DiffUtil.ItemCallback<PixabayObj>() {
    override fun areItemsTheSame(oldItem: PixabayObj, newItem: PixabayObj): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: PixabayObj, newItem: PixabayObj): Boolean {
        return oldItem.id == newItem.id
                && oldItem.previewURL == newItem.previewURL
                && oldItem.largeImageURL == newItem.largeImageURL
    }
}