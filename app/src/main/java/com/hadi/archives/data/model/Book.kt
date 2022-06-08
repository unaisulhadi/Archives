package com.hadi.archives.data.model

data class Book(
    val id: String,
    val title: String,
    val author: String,
    val description: String,
    val imageUrl: String,
    val pageCount: Int,
    val language: String,
    val rating: Double,
    val publisher: String,
    val category: String,
)