package com.hadi.archives.presentation.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.hadi.archives.R
import com.hadi.archives.presentation.components.BrutalBox
import com.hadi.archives.presentation.navigation.Screen
import com.hadi.archives.ui.theme.BrutalBlue
import com.hadi.archives.ui.theme.BrutalYellow
import com.hadi.archives.utils.advancedShadow

@Composable
fun SplashScreen(
    navController: NavController
) {

    rememberSystemUiController().setStatusBarColor(Color.White)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(8f),
            contentAlignment = Alignment.Center
        ) {

            Image(
                modifier = Modifier.size(100.dp),
                painter = painterResource(id = R.drawable.ic_books),
                contentDescription = stringResource(R.string.archives_logo)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(2f),
            contentAlignment = Alignment.Center
        ) {

            BrutalBox(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(horizontal = 32.dp, vertical = 16.dp),
                backgroundColor = BrutalYellow,
                borderColor = Color.Black,
                borderWidth = 4.dp,
                onClick = {
                    navController.navigate(Screen.Welcome.route)
                },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "GET STARTED",
                    style = MaterialTheme.typography.h6.copy(
                        color = Color.Black
                    ),
                )
            }

            /*Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(horizontal = 32.dp)
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
                    )
                    .clickable(onClick = {
                        navController.navigate(Screen.Welcome.route)
                    })
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "GET STARTED",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                )

            }*/

        }

    }
}