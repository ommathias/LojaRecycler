package com.example.lojarecycler

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

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
        //val productDescription: TextView = itemView.findViewById(R.id.tv_description)

    }

    override fun onBindViewHolder(holder: ProductAdapter.ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.productImage.setImageResource(product.imageId)
        holder.productName.text = product.name
        holder.productStock.text = product.stock.toString()
        holder.productPrice.text = "R$ ${product.price}"
       // holder.productDescription.text = product.description

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, ProductDetails::class.java)
            intent.putExtra("product", product)

            holder.itemView.context.startActivity(intent)        }
        }

    override fun getItemCount(): Int = productList.size

}
