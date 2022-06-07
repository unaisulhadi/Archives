package com.hadi.archives.presentation.screens.home

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hadi.archives.data.model.Book
import com.hadi.archives.presentation.components.BrutalBox
import com.hadi.archives.ui.theme.BrutalYellow

@Composable
fun BookCard(index: Int, book: Book) {

    BrutalBox(
        modifier = Modifier
            .width(160.dp)
            .height(200.dp)
            .padding(start =  4.dp, end = 4.dp),
        backgroundColor = BrutalYellow,
        borderWidth = 3.dp,
        cornerRadius = 4.dp,
        shadowBorderWidth = 3.dp,
        shadowCornerRadius = 4.dp
    ) {

    }

}