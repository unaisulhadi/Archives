@file:OptIn(ExperimentalPagerApi::class)

package com.hadi.archives.presentation.screens.welcome

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.hadi.archives.data.model.Slider
import com.hadi.archives.data.model.SliderData
import com.hadi.archives.presentation.components.BrutalBox
import com.hadi.archives.presentation.navigation.Screen
import com.hadi.archives.ui.theme.BrutalYellow
import com.hadi.archives.utils.advancedShadow

@OptIn(ExperimentalPagerApi::class)
@Composable
fun WelcomeScreen(
    navController: NavController
) {

    val pagerState = rememberPagerState()
    val pages = SliderData.slides

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        HorizontalPager(
            modifier = Modifier
                .fillMaxWidth()
                .weight(7.5f),
            count = pages.size,
            state = pagerState
        ) { position ->

            Slider(slide = pages[position])

        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(2.5f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            val density = LocalDensity.current
            DotsIndicator(
                modifier = Modifier.padding(top = 36.dp),
                totalDots = 3,
                selectedIndex = pagerState.currentPage,
            )
            FinishButton(pagerState, navController, pages.size - 1)

        }


    }

}

@Composable
fun FinishButton(
    pagerState: PagerState,
    navController: NavController,
    maxPage: Int
) {
    AnimatedVisibility(
        visible = pagerState.currentPage == maxPage,
        enter = fadeIn(
            animationSpec = tween(durationMillis = 500),
            initialAlpha = 0.2f
        ),
        exit = fadeOut(
            animationSpec = tween(durationMillis = 250)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BrutalBox(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(horizontal = 32.dp, vertical = 16.dp),
                backgroundColor = BrutalYellow,
                borderColor = Color.Black,
                borderWidth = 4.dp,
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "EXPLORE",
                    style = MaterialTheme.typography.h6.copy(
                        color = Color.Black
                    ),
                )
            }
        }


    }
}

@Composable
fun Slider(slide: Slider) {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(32.dp)
                .advancedShadow(
                    color = Color.Black,
                    alpha = 1f,
                    shadowBlurRadius = (0.0001f).dp,
                    offsetX = 6.dp,
                    offsetY = 6.dp
                )
                .background(Color.Blue)
                .border(
                    width = 4.dp,
                    color = Color.Black
                ),
            contentAlignment = Alignment.Center
        ) {

            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(id = slide.image),
                contentScale = ContentScale.Crop,
                contentDescription = null
            )
        }

        Text(
            modifier = Modifier.padding(top = 16.dp, start = 12.dp, end = 12.dp),
            text = slide.quote,
            style = MaterialTheme.typography.subtitle1,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Text(
            modifier = Modifier.padding(top = 16.dp),
            text = "- ${slide.author}",
            color = Color.Black,
            style = MaterialTheme.typography.subtitle1,
            textAlign = TextAlign.Center
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
