package com.hadi.archives.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun TextBox(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Yellow,
    borderWidth: Dp = 0.dp,
    borderColor: Color = Color.Black
) {
    Box(
        modifier = modifier
            .background(backgroundColor)
            .border(
                width = 0.dp,
                color = borderColor,
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "EXPLORE")
    }
}


@Preview(showBackground = true)
@Composable
fun TextBoxPreview() {
    TextBox(
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .padding(16.dp),
        backgroundColor = Color.Yellow,
        borderWidth = 0.dp,
        borderColor = Color.Red
    )
}