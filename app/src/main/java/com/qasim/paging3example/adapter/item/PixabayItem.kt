package com.qasim.paging3example.adapter.item

import android.util.Log
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable
import com.qasim.paging3example.R
import com.qasim.paging3example.data.model.PixabayObj
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.pixabay_list_item.view.*
import java.lang.Exception

class PixabayItem(val pixabayModel: PixabayObj) : Item<GroupieViewHolder>() {

    override fun getLayout(): Int = R.layout.pixabay_list_item

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        initViews(viewHolder.itemView, pixabayModel)
    }

    private fun initViews(itemView: View, passengerModel: PixabayObj) {
        val shimmer =
            Shimmer.AlphaHighlightBuilder()// The attributes for a ShimmerDrawable is set by this builder
                .setDuration(1000) // how long the shimmering animation takes to do one full sweep
                .setBaseAlpha(0.7f) //the alpha of the underlying children
                .setHighlightAlpha(0.6f) // the shimmer alpha amount
                .setDirection(Shimmer.Direction.BOTTOM_TO_TOP)
                .setAutoStart(true)
                .build()
        val shimmerDrawable = ShimmerDrawable().apply {
            setShimmer(shimmer)
        }
        Glide
            .with(itemView.context)
            .load(passengerModel.previewURL)
            .placeholder(shimmerDrawable)
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .into(itemView.loadImg)
        itemView.rootView.setOnClickListener {
            try {
                itemView.performClick()
            } catch (e: Exception) {
                Log.d("Exception", "${e.message}")
            }
//            itemView.performClick()
//            Toast.makeText(itemView.context, "Clicked", Toast.LENGTH_SHORT).show()
        }
    }

}