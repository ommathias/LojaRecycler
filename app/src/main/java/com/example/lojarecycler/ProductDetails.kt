package com.example.lojarecycler

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lojarecycler.databinding.ActivityProductDetailsBinding

class ProductDetails : AppCompatActivity() {

    private lateinit var binding : ActivityProductDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val product = intent.getSerializableExtra("product", Product::class.java)


        if (product != null) {
            binding.tvName.text = product.name
            binding.tvDescription.text = product.description
            binding.tvStock.text = product.description
            binding.tvImage.setImageResource(product.imageId)
            binding.tvPrice.text = "R$ ${product.price}"
        }


        binding.btBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}