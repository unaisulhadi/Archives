package com.hadi.archives.presentation.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.hadi.archives.R
import com.hadi.archives.ui.theme.BrutalYellow
import com.hadi.archives.utils.advancedShadow

@Composable
fun SplashScreen(
    navController: NavController
) {

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

//            Text(
//                text = "GET STARTED",
//                style = MaterialTheme.typography.h4.copy(
//                    color = Color.Black,
//                    shadow = Shadow(
//                        color = Color.Yellow,
//                        offset = Offset(4f, 4f),
//                        blurRadius = 0.01f
//                    )
//                ),
//            )

        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(2f),
            contentAlignment = Alignment.Center
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(72.dp)
                    .padding(horizontal = 32.dp)
                    .advancedShadow(
                        color = Color.Black,
                        alpha = 1f,
                        shadowBlurRadius = (0.0001f).dp,
                        offsetX = 8.dp,
                        offsetY = 8.dp
                    )
                    .background(BrutalYellow)
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

            }

        }

    }
}