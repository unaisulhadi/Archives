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
import com.hadi.archives.ui.theme.BrutalYellow

@OptIn(ExperimentalCoilApi::class)
@Composable
fun BookCard(index: Int, book: Book) {

    BrutalBox(
        modifier = Modifier
            .width(160.dp)
            .height(200.dp)
            .padding(start = 4.dp, end = 4.dp),
        backgroundColor = BrutalYellow,
        borderWidth = 3.dp,
        cornerRadius = 6.dp,
        shadowBorderWidth = 3.dp,
        shadowCornerRadius = 6.dp
    ) {

        val painter = rememberImagePainter(data = book.thumbnailUrl) {
            placeholder(R.drawable.ic_book_placeholder)
            error(R.drawable.ic_book_placeholder)
        }

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 6.dp,
                            topEnd = 6.dp,
                            bottomEnd = 0.dp,
                            bottomStart = 0.dp
                        )
                    ),
                painter = painter,
                contentScale = ContentScale.Crop,
                contentDescription = "Book Thumbnail"
            )
//            Divider(
//                modifier = Modifier
//                    .height(4.dp)
//                    .background(Color.Black)
//            )
            Text(
                modifier = Modifier.padding(top = 4.dp, start = 6.dp, end = 6.dp),
                text = book.title,
                maxLines = 1,
                style = MaterialTheme.typography.subtitle1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                modifier = Modifier.padding(vertical = 4.dp, horizontal = 6.dp),
                text = book.authors.getOrElse(0) { "-" },
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

        }

    }

}