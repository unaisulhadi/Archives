package com.hadi.archives.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.applyBrutalism(
    backgroundColor: Color = Color.White,
    shadowColor: Color = Color.Black,
    alpha: Float = 1f,
    borderWidth: Dp = 4.dp,
    cornersRadius: Dp = 4.dp,
    offsetY: Dp = 4.dp,
    offsetX: Dp = 4.dp
) = drawBehind {

    val  shadowBlurRadius: Dp = (0.0001f).dp
    val shadowcolor = shadowColor
        .copy(alpha = alpha)
        .toArgb()
    val transparentColor = shadowColor
        .copy(alpha = 0f)
        .toArgb()

    drawIntoCanvas {
        val paint = Paint()
        val frameworkPaint = paint.asFrameworkPaint()
        frameworkPaint.color = transparentColor
        frameworkPaint.setShadowLayer(
            shadowBlurRadius.toPx(),
            offsetX.toPx(),
            offsetY.toPx(),
            shadowcolor
        )
        it.drawRoundRect(
            0f,
            0f,
            this.size.width,
            this.size.height,
            cornersRadius.toPx(),
            cornersRadius.toPx(),
            paint
        )
    }
}
    .background(
        color = backgroundColor,
        shape = RoundedCornerShape(cornersRadius)
    )
    .border(
        width = borderWidth,
        color = if (borderWidth == 0.dp) {
            Color.Transparent
        } else {
            shadowColor
        },
        shape = RoundedCornerShape(cornersRadius)
    )
    .clip(shape = RoundedCornerShape(cornersRadius))
