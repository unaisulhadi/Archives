package com.hadi.archives.presentation.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.hadi.archives.R
import com.hadi.archives.data.model.Book
import com.hadi.archives.ui.theme.BrutalBlue
import com.hadi.archives.utils.applyBrutalism

@OptIn(ExperimentalCoilApi::class)
@Composable
fun BookCard(book: Book, onBookSelected: (Book) -> Unit) {

    Box(
        modifier = Modifier
            .width(160.dp)
            .height(240.dp)
            .padding(start = 4.dp, end = 4.dp)
            .applyBrutalism(
                backgroundColor = BrutalBlue,
                borderWidth = 3.dp,
                cornersRadius = 6.dp
            )
            .clickable(
                onClick = { onBookSelected(book) }
            ),
    ) {

        val painter = rememberImagePainter(data = book.imageUrl) {
            placeholder(R.drawable.ic_book_placeholder)
            error(R.drawable.ic_book_placeholder)
        }

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painter,
                contentScale = ContentScale.Crop,
                contentDescription = "Book Thumbnail"
            )

        }

    }

}