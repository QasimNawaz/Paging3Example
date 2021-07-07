package com.qasim.paging3example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable
import com.qasim.paging3example.R
import com.qasim.paging3example.data.model.PixabayObj
import com.qasim.paging3example.utils.DiffUtilCallBack
import kotlinx.android.synthetic.main.pixabay_list_item.view.*

class PixabayAdapter :
    PagingDataAdapter<PixabayObj, PixabayAdapter.RedditViewHolder>(DiffUtilCallBack()) {

    companion object {
        // Define Loading ViewType
        val LOADING_ITEM = 0

        // Define Movie ViewType
        val MOVIE_ITEM = 1
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RedditViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.pixabay_list_item, parent, false)
        return RedditViewHolder(view)
    }

    override fun onBindViewHolder(holder: RedditViewHolder, position: Int) {
        getItem(position)?.let { holder.bindPost(it) }
    }

    override fun getItemViewType(position: Int): Int {
        // set ViewType
        return if (position == itemCount) MOVIE_ITEM else LOADING_ITEM
    }

    class RedditViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val loadImg: ImageView = itemView.loadImg
        private val shimmer: Shimmer =
            Shimmer.AlphaHighlightBuilder()// The attributes for a ShimmerDrawable is set by this builder
                .setDuration(1000) // how long the shimmering animation takes to do one full sweep
                .setBaseAlpha(0.7f) //the alpha of the underlying children
                .setHighlightAlpha(0.6f) // the shimmer alpha amount
                .setDirection(Shimmer.Direction.BOTTOM_TO_TOP)
                .setAutoStart(true)
                .build()
        private val shimmerDrawable = ShimmerDrawable().apply {
            setShimmer(shimmer)
        }

        fun bindPost(redditPost: PixabayObj) {
            with(redditPost) {
                Glide
                    .with(itemView.context)
                    .load(redditPost.previewURL)
                    .placeholder(shimmerDrawable)
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                    .into(loadImg)
            }
        }
    }
}