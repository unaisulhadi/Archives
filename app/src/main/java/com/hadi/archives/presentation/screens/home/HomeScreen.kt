package com.hadi.archives.presentation.screens.home

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.hadi.archives.R
import com.hadi.archives.data.local.getManagementBooks
import com.hadi.archives.data.local.getRecentRead
import com.hadi.archives.data.local.getScienceFictions
import com.hadi.archives.presentation.components.CircularProgressBar
import com.hadi.archives.presentation.navigation.Screen
import com.hadi.archives.ui.theme.*
import com.hadi.archives.utils.applyBrutalism

@OptIn(ExperimentalCoilApi::class)
@Composable
fun HomeScreen(
    navController: NavController = rememberNavController()
) {

    val scrollState = rememberScrollState()

    val recentRead = getRecentRead()

    val painter = rememberImagePainter(data = recentRead.imageUrl) {
        placeholder(R.drawable.ic_book_placeholder)
        error(R.drawable.ic_book_placeholder)
    }
    rememberSystemUiController().setStatusBarColor(BrutalBlue)


    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
            .fillMaxSize(),
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(BrutalBlue),
            horizontalAlignment = Alignment.End
        ) {

            Box(
                modifier = Modifier
                    .padding(all = 12.dp)
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
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = "Notifications"
                )
            }


            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, end = 12.dp, top = 16.dp),
                text = "Explore thousands of Books in a go",
                style = MonumentTypography.h3.copy(
                    fontSize = 26.sp
                )
            )

        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = (-30).dp)
        ) {
            SearchBox()

            Text(
                modifier = Modifier.padding(start = 12.dp, top = 8.dp, end = 12.dp),
                text = "Continue Reading",
                style = MaterialTheme.typography.h6,
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .padding(horizontal = 12.dp, vertical = 8.dp)
                    .applyBrutalism(
                        backgroundColor = BrutalYellow,
                        borderWidth = 3.dp,
                        cornersRadius = 6.dp
                    )
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Image(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(120.dp),
                        painter = painter,
                        contentScale = ContentScale.Crop,
                        contentDescription = "Continue Reading"
                    )

                    Divider(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(4.dp)
                            .background(Color.Black)
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = recentRead.title,
                            style = MaterialTheme.typography.h5,
                            maxLines = 2
                        )
                        Text(
                            text = "By " + recentRead.author,
                            style = MaterialTheme.typography.subtitle2,
                            color = Color.Black.copy(alpha = 0.5f),
                            maxLines = 2
                        )

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                                .padding(bottom = 4.dp, end = 4.dp)
                                .applyBrutalism(
                                    backgroundColor = BrutalBlue,
                                    borderWidth = 3.dp
                                )
                        ) {
                            Row(
                                modifier = Modifier.fillMaxSize(),
                                horizontalArrangement = Arrangement.SpaceAround,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Continue Reading",
                                    style = MaterialTheme.typography.subtitle1,
                                    color = Color.White
                                )
                                CircularProgressBar(
                                    percentage = 0.64f,
                                    radius = 12.dp,
                                    color = Color.White,
                                    strokeWidth = 3.dp,
                                )


                            }

                        }

                    }

                }


            }

            Text(
                modifier = Modifier.padding(start = 12.dp, top = 8.dp, end = 12.dp),
                text = "Recommended For You",
                style = MaterialTheme.typography.h6,
            )

            LazyRow(
                contentPadding = PaddingValues(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                itemsIndexed(items = getScienceFictions()) { index, book ->
                    BookCard(book = book){
                        navController.navigate(Screen.Details.route)
                    }
                }
            }

            Text(
                modifier = Modifier.padding(start = 12.dp, top = 8.dp, end = 12.dp),
                text = "Best Sellers",
                style = MaterialTheme.typography.h6,
            )
            LazyRow(
                contentPadding = PaddingValues(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                itemsIndexed(items = getManagementBooks()) { index, book ->
                    BookCard(book = book){
                        navController.navigate(Screen.Details.route)
                    }
                }
            }
        }

    }

}


@Composable
fun SearchBox() {
    var search by remember {
        mutableStateOf("")
    }


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 12.dp)
            .applyBrutalism(
                backgroundColor = BrutalPink,
                borderWidth = 3.dp,
                cornersRadius = 6.dp
            ),
        contentAlignment = Alignment.CenterStart,
    ) {

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(
                onClick = { },
            ) {
                Icon(
                    modifier = Modifier
                        .size(36.dp)
                        .padding(start = 6.dp),
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search"
                )
            }

            Box() {
                BasicTextField(
                    value = search,
                    onValueChange = {
                        search = it
                    },
                    maxLines = 1,
                    singleLine = true,
                    textStyle = TextStyle(
                        color = Color.Black,
                        fontFamily = GoshaSans,
                        fontSize = 18.sp
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            //keyboardController?.hide()
                        }
                    )
                )
                if (search.isEmpty()) {

                    Text(
                        text = "Search books...",
                        color = Color.Black.copy(alpha = 0.5f),
                        fontFamily = GoshaSans,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Start
                    )

                }
            }
        }


    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPrev() {
    HomeScreen()
}