package com.qasim.paging3example.adapter.pagedlist

import androidx.lifecycle.Lifecycle
import androidx.paging.AsyncPagingDataDiffer
import androidx.paging.PagingData
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListUpdateCallback
import com.qasim.paging3example.adapter.item.PixabayItem
import com.xwray.groupie.Group
import com.xwray.groupie.GroupDataObserver
import com.xwray.groupie.Item

class PixabayPagedListGroup: Group, GroupDataObserver {
    val TAG = PixabayPagedListGroup::class.java.simpleName

    private var parentObserver: GroupDataObserver? = null
    var pagedList: PagingData<PixabayItem>? = null

    private val listUpdateCallback = object : ListUpdateCallback {
        override fun onInserted(position: Int, count: Int) {
            parentObserver!!.onItemRangeInserted(this@PixabayPagedListGroup, position, count)
        }

        override fun onRemoved(position: Int, count: Int) {
            parentObserver!!.onItemRangeRemoved(this@PixabayPagedListGroup, position, count)
        }

        override fun onMoved(fromPosition: Int, toPosition: Int) {
            parentObserver!!.onItemMoved(this@PixabayPagedListGroup, fromPosition, toPosition)
        }

        override fun onChanged(position: Int, count: Int, payload: Any?) {
            parentObserver!!.onItemRangeChanged(this@PixabayPagedListGroup, position, count)
        }
    }

    private val differ = AsyncPagingDataDiffer(
        object : DiffUtil.ItemCallback<PixabayItem>() {
            override fun areItemsTheSame(oldItem: PixabayItem, newItem: PixabayItem): Boolean {
                return oldItem.pixabayModel.id == newItem.pixabayModel.id
            }

            override fun areContentsTheSame(
                oldItem: PixabayItem,
                newItem: PixabayItem
            ): Boolean {
                return equals(oldItem, newItem)
            }

            fun equals(obj1: PixabayItem, obj2: PixabayItem): Boolean {
                return obj1.pixabayModel.id == obj2.pixabayModel.id

            }

            override fun getChangePayload(oldItem: PixabayItem, newItem: PixabayItem): Any? {
                return newItem
            }
        },
        listUpdateCallback
    )

    private var placeHolder: com.xwray.groupie.kotlinandroidextensions.Item? = null

    fun submitList(lifetime: Lifecycle, newPagedList: PagingData<PixabayItem>?) {
        pagedList = newPagedList
        differ.submitData(lifetime, newPagedList!!)
    }

    override fun getItemCount(): Int {
        return differ.itemCount
    }

    override fun getItem(position: Int): Item<*> {
        val item = differ.getItem(position)
        if (item != null) {

            // find more efficiency registration timing, and removing observer
            item.registerGroupDataObserver(this)
            return item
        }
        return placeHolder!!
    }

    override fun getPosition(item: Item<*>): Int {
        differ.getItem(item.itemCount)
        val currentList = differ.snapshot().items ?: return -1
        return currentList.indexOf(item)
    }

    override fun registerGroupDataObserver(groupDataObserver: GroupDataObserver) {
        parentObserver = groupDataObserver
    }

    override fun unregisterGroupDataObserver(groupDataObserver: GroupDataObserver) {
        parentObserver = null
    }

    override fun onChanged(group: Group) {
        parentObserver!!.onChanged(this)
    }

    override fun onItemInserted(group: Group, position: Int) {
        throw UnsupportedOperationException()
    }

    override fun onItemChanged(group: Group, position: Int) {
        val index = getItemPosition(group)
        if (index >= 0) {
            parentObserver!!.onItemChanged(this, index)
        }
    }

    override fun onItemChanged(group: Group, position: Int, payload: Any) {
        val index = getItemPosition(group)
        if (index >= 0) {
            parentObserver!!.onItemChanged(this, index, payload)
        }
    }

    override fun onItemRemoved(group: Group, position: Int) {
        throw UnsupportedOperationException()
    }

    override fun onItemRangeChanged(
        group: Group,
        positionStart: Int,
        itemCount: Int,
        payload: Any?
    ) {
        throw UnsupportedOperationException()
    }

    override fun onItemRangeInserted(group: Group, positionStart: Int, itemCount: Int) {
        throw UnsupportedOperationException()
    }

    override fun onItemRangeRemoved(group: Group, positionStart: Int, itemCount: Int) {
        throw UnsupportedOperationException()
    }

    override fun onItemMoved(group: Group, fromPosition: Int, toPosition: Int) {
        throw UnsupportedOperationException()
    }

    override fun onItemRangeChanged(group: Group, positionStart: Int, itemCount: Int) {
        throw UnsupportedOperationException()
    }

    private fun getItemPosition(group: Group): Int {

        return getItemPosition(group)
    }
}