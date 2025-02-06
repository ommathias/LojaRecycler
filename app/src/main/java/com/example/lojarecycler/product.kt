package com.example.lojarecycler

import java.io.Serializable
import java.text.NumberFormat
import java.util.Locale

data class Product(

    val name: String,
    val price: Double,
    val stock: Int,
    val imageId: Int,
    val description: String
): Serializable