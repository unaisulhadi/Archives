package com.hadi.archives.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.hadi.archives.R

val GoshaSans = FontFamily(
    Font(
        resId = R.font.gosha_sans_bold,
        weight = FontWeight.SemiBold,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.gosha_sans_regular,
        weight = FontWeight.Normal,
        style = FontStyle.Normal
    )
)

private val MonumentExtended = FontFamily(
    Font(
        resId = R.font.monument_extended_ultrabold,
        weight = FontWeight.Bold,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.monument_extended_regular,
        weight = FontWeight.Normal,
        style = FontStyle.Normal
    )
)

val MonumentTypography = Typography(

    h3 = TextStyle(
        fontFamily = MonumentExtended,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
    )
)


val Typography = Typography(

    h3 = TextStyle(
        fontFamily = GoshaSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 44.sp,
    ),

    h4 = TextStyle(
        fontFamily = GoshaSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
    ),

    h5 = TextStyle(
        fontFamily = GoshaSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
    ),

    h6 = TextStyle(
        fontFamily = GoshaSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
    ),

    subtitle1 = TextStyle(
        fontFamily = GoshaSans,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
    ),

    subtitle2 = TextStyle(
        fontFamily = GoshaSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),

    body1 = TextStyle(
        fontFamily = GoshaSans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 28.sp,
    ),

    body2 = TextStyle(
        fontFamily = GoshaSans,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 28.sp,
    ),

    button = TextStyle(
        fontFamily = GoshaSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    )
)