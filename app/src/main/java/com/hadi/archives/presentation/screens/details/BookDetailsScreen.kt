package com.hadi.archives.presentation.screens.details

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.hadi.archives.R
import com.hadi.archives.data.local.getManagementBooks
import com.hadi.archives.ui.theme.BrutalYellow
import com.hadi.archives.utils.applyBrutalism

@OptIn(ExperimentalCoilApi::class)
@Composable
fun BookDetailsScreen(
    navController: NavController
) {

    rememberSystemUiController().setStatusBarColor(Color.White)

    val scrollState = rememberScrollState()

    val book = getManagementBooks()[0]

    val painter = rememberImagePainter(data = book.imageUrl) {
        placeholder(R.drawable.ic_book_placeholder)
        error(R.drawable.ic_book_placeholder)
    }

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
                    .size(40.dp)
                    .applyBrutalism(
                        backgroundColor = BrutalYellow,
                        borderWidth = 3.dp,
                        cornersRadius = 0.dp
                    ),
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

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .applyBrutalism(
                        backgroundColor = BrutalYellow,
                        borderWidth = 3.dp,
                        cornersRadius = 0.dp
                    ),
                contentAlignment = Alignment.Center
            ) {


                Icon(
                    modifier = Modifier
                        .size(36.dp)
                        .padding(all = 6.dp),
                    painter = painterResource(id = R.drawable.ic_bookmark),
                    contentDescription = "Notifications"
                )

            }

        }

        //Book Cover
        Box(
            modifier = Modifier
                .width(250.dp)
                .height(340.dp)
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

        Row() {
            Text(
                text = "Author : ",
                style = MaterialTheme.typography.h6,
                color = Color.DarkGray
            )

            Text(
                text = book.author,
                style = MaterialTheme.typography.h6,
                color = Color.Black
            )
        }


        //Stats
        Row(
            modifier = Modifier
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

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "Released",
                    style = MaterialTheme.typography.subtitle2,
                    color = Color.DarkGray
                )

                Text(
                    text = "2022",
                    style = MaterialTheme.typography.subtitle1,
                    color = Color.DarkGray
                )

            }

            Divider(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(4.dp)
                    .background(Color.Black)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "Pages",
                    style = MaterialTheme.typography.subtitle2,
                    color = Color.DarkGray
                )

                Text(
                    text = book.pageCount.toString(),
                    style = MaterialTheme.typography.subtitle1,
                    color = Color.DarkGray
                )

            }

            Divider(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(4.dp)
                    .background(Color.Black)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "Rating",
                    style = MaterialTheme.typography.subtitle2,
                    color = Color.DarkGray
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        imageVector = Icons.Filled.Star,
                        tint = BrutalYellow,
                        contentDescription = null
                    )

                    Text(
                        text = book.rating.toString(),
                        style = MaterialTheme.typography.subtitle1,
                        color = Color.DarkGray
                    )
                }


            }

        }


    }


}


@Preview(showBackground = true)
@Composable
fun BookDetailsPreview() {
    BookDetailsScreen(navController = rememberNavController())
}