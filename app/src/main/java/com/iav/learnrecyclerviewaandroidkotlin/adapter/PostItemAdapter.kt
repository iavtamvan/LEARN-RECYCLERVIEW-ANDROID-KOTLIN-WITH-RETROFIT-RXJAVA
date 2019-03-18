package com.iav.learnrecyclerviewaandroidkotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iav.learnrecyclerviewaandroidkotlin.R
import com.iav.learnrecyclerviewaandroidkotlin.model.Post
import kotlinx.android.synthetic.main.post_item_layout.view.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.toast

class PostItemAdapter(val postList: List<Post>, val context: Context) :
    RecyclerView.Adapter<PostItemAdapter.viewHolder>() {
    class viewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(model: Post) {
            itemView.tvTittle.text = model.title
            itemView.tvBody.text = model.body

            itemView.onClick {
                itemView.context.toast("Ini "+model.title)
            }
        }
//        val tvTittle = view.tvTittle
//        val tvBody = view.tvBody
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): viewHolder {
        return viewHolder(LayoutInflater.from(context).inflate(R.layout.post_item_layout, p0, false))

    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(p0: viewHolder, p1: Int) {
        p0.bind(postList.get(p1))
//        p0.tvTittle.text = postList.get(p1).title
//        p0.tvBody.text = postList.get(p1).body
    }
}