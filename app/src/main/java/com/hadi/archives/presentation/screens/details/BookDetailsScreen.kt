package com.hadi.archives.presentation.screens.details

import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.hadi.archives.R
import com.hadi.archives.data.local.getAllBooks
import com.hadi.archives.data.local.getManagementBooks
import com.hadi.archives.data.model.Book
import com.hadi.archives.ui.theme.BrutalBlue
import com.hadi.archives.ui.theme.BrutalYellow
import com.hadi.archives.utils.applyBrutalism

@OptIn(ExperimentalCoilApi::class)
@Composable
fun BookDetailsScreen(
    navController: NavController,
    bookId: String
) {

    rememberSystemUiController().setStatusBarColor(Color.White)

    val scrollState = rememberScrollState()

    val book = getAllBooks().first { it.id == bookId }

    val painter = rememberImagePainter(data = book.imageUrl) {
        placeholder(R.drawable.ic_book_placeholder)
        error(R.drawable.ic_book_placeholder)
    }

    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(scrollState)
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, end = 12.dp, top = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .applyBrutalism(
                            backgroundColor = BrutalYellow,
                            borderWidth = 3.dp,
                        )
                        .clickable {
                            navController.popBackStack()
                        },
                    contentAlignment = Alignment.Center
                ) {

                    Icon(
                        modifier = Modifier
                            .size(36.dp)
                            .padding(all = 6.dp),
                        painter = painterResource(id = R.drawable.ic_left_arrow),
                        contentDescription = "Notifications"
                    )

                }


            }

            //Book Cover
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .height(360.dp)
                    .padding(all = 12.dp)
                    .applyBrutalism(
                        backgroundColor = BrutalYellow,
                        borderWidth = 3.dp,
                        cornersRadius = 6.dp
                    ),
                contentAlignment = Alignment.Center
            ) {


                Image(
                    modifier = Modifier
                        .fillMaxSize(),
                    painter = painter,
                    contentScale = ContentScale.Crop,
                    contentDescription = "Notifications"
                )

            }
            Text(
                modifier = Modifier.padding(start = 12.dp, end = 12.dp, top = 12.dp),
                text = book.title,
                style = MaterialTheme.typography.h4,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = book.author,
                style = MaterialTheme.typography.subtitle1,
                color = Color.Gray
            )
            BookDetailsSection(book = book)

            //Synopsis
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, end = 12.dp, top = 8.dp),
            ) {
                Text(
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                    text = "Synopsis",
                    style = MaterialTheme.typography.subtitle1,
                    color = Color.Gray
                )
                Text(
                    text = book.description,
                    style = MaterialTheme.typography.subtitle2,
                    color = Color.DarkGray
                )

            }
            //ClipToPadding
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
            )

        }
        //White Gradient at Bottom
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.White
                        ),
                    )
                )
                .align(Alignment.BottomCenter)
        )
        PrimaryBookActions(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.BottomCenter)
        )
    }

}


//Start Reading and Save Buttons
@Composable
fun PrimaryBookActions(modifier: Modifier = Modifier) {

    var saveBook by remember {
        mutableStateOf(false)
    }

    Row(
        modifier = modifier
    ) {

        Box(
            modifier = Modifier
                .width(70.dp)
                .height(80.dp)
                .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                .applyBrutalism(
                    backgroundColor = BrutalYellow,
                    borderWidth = 3.dp,

                    )
                .clickable {
                    saveBook = !saveBook
                },
            contentAlignment = Alignment.Center
        ) {


            Icon(
                modifier = Modifier
                    .size(36.dp)
                    .padding(all = 6.dp),
                painter = painterResource(id = if (saveBook) R.drawable.ic_bookmark else R.drawable.ic_bookmark_outlined),
                contentDescription = "Notifications"
            )

        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(all = 12.dp)
                .applyBrutalism(
                    backgroundColor = BrutalBlue,
                    borderWidth = 4.dp
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Start Reading",
                style = MaterialTheme.typography.h6,
                color = Color.White
            )
        }
    }
}


@Composable
fun BookDetailsSection(modifier: Modifier = Modifier, book: Book) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(horizontal = 12.dp, vertical = 12.dp)
            .background(Color.White)
            .border(
                width = 4.dp,
                color = Color.Black,
                shape = RoundedCornerShape(6.dp)
            ),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {

        BookFeature(
            modifier = Modifier.weight(1f),
            feature = "Released",
            value = "2022"
        )

        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .width(4.dp)
                .background(Color.Black)
        )
        BookFeature(
            modifier = Modifier.weight(1f),
            feature = "Pages",
            value = book.pageCount.toString()
        )


        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .width(4.dp)
                .background(Color.Black)
        )
        BookFeature(
            modifier = Modifier.weight(1f),
            feature = "Language",
            value = book.language
        )

        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .width(4.dp)
                .background(Color.Black)
        )

        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier.padding(bottom = 4.dp),
                text = "Rating",
                style = MaterialTheme.typography.subtitle2,
                color = Color.Gray
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = book.rating.toString(),
                    style = MaterialTheme.typography.subtitle1,
                    color = Color.DarkGray
                )
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    imageVector = Icons.Filled.Star,
                    tint = BrutalYellow,
                    contentDescription = null
                )

            }
        }
    }
}


@Composable
fun BookFeature(modifier: Modifier, feature: String, value: String) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            modifier = Modifier.padding(bottom = 4.dp),
            text = feature,
            style = MaterialTheme.typography.subtitle2,
            color = Color.Gray
        )

        Text(
            text = value,
            style = MaterialTheme.typography.subtitle1,
            color = Color.DarkGray
        )

    }
}


@Preview(showBackground = true)
@Composable
fun BookDetailsPreview() {
    BookDetailsScreen(navController = rememberNavController(), "1")
}