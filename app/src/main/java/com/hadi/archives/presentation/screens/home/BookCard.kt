package com.hadi.archives.presentation.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.hadi.archives.R
import com.hadi.archives.data.model.Book
import com.hadi.archives.presentation.components.BrutalBox
import com.hadi.archives.ui.theme.BrutalBlue
import com.hadi.archives.ui.theme.BrutalYellow
import com.hadi.archives.utils.applyBrutalism

@OptIn(ExperimentalCoilApi::class)
@Composable
fun BookCard(index: Int, book: Book) {

    Box(
        modifier = Modifier
            .width(160.dp)
            .height(240.dp)
            .padding(start = 4.dp, end = 4.dp)
            .applyBrutalism(
                backgroundColor = BrutalBlue,
                borderWidth = 3.dp,
                cornersRadius = 6.dp
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
                    .fillMaxSize()
                    .clip(
                        RoundedCornerShape(6.dp)
                    ),
                painter = painter,
                contentScale = ContentScale.Crop,
                contentDescription = "Book Thumbnail"
            )

        }

    }

}