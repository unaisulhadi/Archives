package com.hadi.archives.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.hadi.archives.ui.theme.BrutalYellow

@Composable
fun BrutalBox(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Black,
    borderWidth: Dp = 0.dp,
    borderColor: Color = Color.Black,
    shadowColor: Color = Color.Black,
    shadowBorderWidth: Dp = 0.dp,
    shadowBorderColor: Color = Color.Black,
    shadowAlpha: Float = 1f,
    blur: Dp = (0.0001f).dp,
    offsetX: Dp = 6.dp,
    offsetY: Dp = 6.dp,
    contentAlignment: Alignment = Alignment.TopStart,
    clickEnabled: Boolean = true,
    onClick: () -> Unit = {},
    content: @Composable () -> Unit
) {
    //Issue Fix: Brutal Box inside Rows and Columns
    Box {
        //Shadow Layer
        Box(
            modifier = modifier
                .offset(
                    x = offsetX,
                    y = offsetY
                )
                .background(shadowColor)
                .border(
                    width = shadowBorderWidth,
                    color = shadowBorderColor
                )
                .alpha(shadowAlpha)
        ) {

        }

        //Content Layer
        Box(
            modifier = modifier
                .background(backgroundColor)
                .border(
                    width = borderWidth,
                    color = borderColor
                )
                .clickable(
                    enabled = clickEnabled,
                    onClick = onClick
                ),
            contentAlignment = contentAlignment
        ) {
            content()
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BrutalBoxPreview() {
    Column() {
        BrutalBox(
            modifier = Modifier
                .width(200.dp)
                .height(75.dp)
                .padding(horizontal = 16.dp, vertical = 16.dp),
            backgroundColor = BrutalYellow,
            shadowColor = Color.Blue,
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Hello World")
        }
    }

}