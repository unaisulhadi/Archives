@file:OptIn(ExperimentalPagerApi::class)

package com.hadi.archives.presentation.screens.welcome

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.hadi.archives.R
import com.hadi.archives.ui.theme.BrutalYellow
import com.hadi.archives.utils.advancedShadow

@OptIn(ExperimentalPagerApi::class)
@Composable
fun WelcomeScreen(
    navController: NavController
) {

    val pagerState = rememberPagerState()
    val pages = listOf<Int>(
        R.drawable.slide_1,
        R.drawable.slide_2,
        R.drawable.slide_3
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        HorizontalPager(
            modifier = Modifier
                .fillMaxWidth()
                .weight(7f),
            count = pages.size,
            state = pagerState
        ) { position ->

            Slider(image = pages[position])

        }

         DotsIndicator(
             modifier = Modifier
                 .fillMaxSize()
                 .weight(3f),
             totalDots = 3,
             selectedIndex = pagerState.currentPage,
         )

    }

}

@Composable
fun Slider(image: Int) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp)
            .advancedShadow(
                color = Color.Black,
                alpha = 1f,
                shadowBlurRadius = (0.0001f).dp,
                offsetX = 6.dp,
                offsetY = 6.dp
            )
            .background(BrutalYellow)
            .border(
                width = 4.dp,
                color = Color.Black
            ),
        contentAlignment = Alignment.Center
    ) {

        Image(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(id = image),
            contentDescription = null
        )
    }
}

@Composable
fun DotsIndicator(
    modifier: Modifier = Modifier,
    totalDots: Int,
    selectedIndex: Int
) {

    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ) {

        items(totalDots) { index ->
            if (index == selectedIndex) {
                Box(
                    modifier = Modifier
                        .height(15.dp)
                        .width(30.dp)
                        .background(Color.Black)
                        .border(
                            width = 2.dp,
                            color = Color.Black
                        )
                )
            } else {
                Box(
                    modifier = Modifier
                        .height(15.dp)
                        .width(15.dp)
                        .background(BrutalYellow)
                        .border(
                            width = 2.dp,
                            color = Color.Black
                        )
                )
            }

            if (index != totalDots - 1) {
                Spacer(modifier = Modifier.padding(horizontal = 2.dp))
            }
        }
    }
}
