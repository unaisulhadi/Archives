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
import com.hadi.archives.ui.theme.MonumentTypography
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

            Text(
                text = "THE ART OF\nBRUTALI-\nSM",
                style = MonumentTypography.h3.copy(
                    fontSize = 75.sp
                )
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
                cornerRadius = 4.dp,
                shadowCornerRadius = 4.dp,
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

        }

    }
}