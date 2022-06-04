package com.hadi.archives.presentation.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.hadi.archives.R

@Composable
fun SplashScreen(
    navController: NavController
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier.fillMaxSize(fraction = 0.7f),
            contentAlignment = Alignment.Center
        ) {

            Image(
                modifier = Modifier.size(36.dp),
                painter = painterResource(id = R.drawable.ic_books),
                contentDescription = stringResource(R.string.archives_logo)
            )

        }

        Box(
            modifier = Modifier.fillMaxSize(fraction = 0.3f),
            contentAlignment = Alignment.Center
        ) {


        }

    }


}