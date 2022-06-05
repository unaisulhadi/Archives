package com.hadi.archives.data.model

import com.hadi.archives.R

data class Slider(
    val image: Int,
    val quote: String,
    val author: String
)


object SliderData {
    val slides = listOf<Slider>(
        Slider(R.drawable.slide_1,"Sleep is good, he said, and books are better.","George R.R. Martin"),
        Slider(R.drawable.slide_2,"Books are uniquely portable magic.","Walt Disney"),
        Slider(R.drawable.slide_3,"There is no friend as loyal as a book.","Stephen King"),
    )
}

