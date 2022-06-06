package com.hadi.archives.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.hadi.archives.presentation.components.BrutalBox
import com.hadi.archives.ui.theme.BrutalBlue
import com.hadi.archives.ui.theme.MonumentTypography

@Composable
fun HomeScreen(
    navController: NavController = rememberNavController()
) {

    rememberSystemUiController().setStatusBarColor(BrutalBlue)

    Column(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(BrutalBlue),
            contentAlignment = Alignment.CenterStart
        ) {

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                text = "Explore thousands of Books in a go",
                style = MonumentTypography.h3.copy(
                    fontSize = 26.sp
                )
            )

        }

        BrutalBox(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 16.dp)
                .offset(y = (-30).dp),
            backgroundColor = Color.White,
            borderColor = Color.Black,
            borderWidth = 4.dp,
            cornerRadius = 4.dp,
            shadowCornerRadius = 4.dp

        ) {

        }

    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPrev() {
    HomeScreen()
}