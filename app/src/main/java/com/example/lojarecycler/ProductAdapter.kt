package com.example.lojarecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val productList: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductAdapter.ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product,parent,false)
        return ProductViewHolder(view)
    }

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage: ImageView = itemView.findViewById(R.id.productImage)
        val productName: TextView = itemView.findViewById(R.id.productName)
        val productStock: TextView = itemView.findViewById(R.id.productStock)
        val productPrice: TextView = itemView.findViewById(R.id.productPrice)

    }

    override fun onBindViewHolder(holder: ProductAdapter.ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.productImage.setImageResource(product.imageId)
        holder.productName.text = product.name
        holder.productStock.text = product.stock.toString()
        holder.productPrice.text = "R$ ${product.price}"

        }

    override fun getItemCount(): Int = productList.size

}
