package com.hadi.archives.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.hadi.archives.R
import com.hadi.archives.presentation.components.BrutalBox
import com.hadi.archives.ui.theme.BrutalBlue
import com.hadi.archives.ui.theme.BrutalYellow
import com.hadi.archives.ui.theme.GoshaSans
import com.hadi.archives.ui.theme.MonumentTypography

@Composable
fun HomeScreen(
    navController: NavController = rememberNavController()
) {

    rememberSystemUiController().setStatusBarColor(BrutalBlue)
    var search by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(BrutalBlue),
            horizontalAlignment = Alignment.End
        ) {

            BrutalBox(
                modifier = Modifier
                    .padding(all = 12.dp)
                    .size(40.dp),
                backgroundColor = BrutalYellow,
                borderColor = Color.Black,
                borderWidth = 3.dp
            ) {
                IconButton(
                    onClick = {

                    },
                ) {
                    Icon(
                        modifier = Modifier
                            .size(36.dp)
                            .padding(all = 6.dp),
                        painter = painterResource(id = R.drawable.ic_notification),
                        contentDescription = "Notifications"
                    )
                }
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

        BrutalBox(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 16.dp)
                .offset(y = (-30).dp),
            backgroundColor = Color.White,
            borderColor = Color.Black,
            borderWidth = 4.dp,
            cornerRadius = 6.dp,
            shadowCornerRadius = 6.dp,
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

                Box(modifier = Modifier) {
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
                            color = Color.Black,
                            fontFamily = GoshaSans,
                            fontSize = 18.sp,
                            textAlign = TextAlign.Start
                        )

                    }
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