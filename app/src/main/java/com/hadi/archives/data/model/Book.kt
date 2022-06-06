package com.hadi.archives.data.model

data class Book(
    val authors: List<String> = emptyList(),
    val categories: List<String> = emptyList(),
    val isbn: String = "",
    val longDescription: String = "",
    val pageCount: Int = 0,
    val shortDescription: String = "",
    val status: String = "",
    val thumbnailUrl: String = "",
    val title: String = ""
)
