package com.example.recyclerviewreto

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewreto.databinding.ItemCardBinding
import org.json.JSONObject

class MainAdapter(private val products: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(products[position])
    }

    override fun getItemCount(): Int = products.size

    class MainHolder(val binding: ItemCardBinding): RecyclerView.ViewHolder(binding.root){
        fun render(product: JSONObject){
            binding.ProductName.setText(product.getString("product"))
            binding.ProductReviews.setText(product.getString("reviews"))
            binding.ProductCost.setText(product.getString("cost"))
            binding.ProductRating.rating = product.getString("rating").toFloat()
            binding.ProductThumbnail.setImageResource(R.drawable.product_placeholder)
        }
    }
}