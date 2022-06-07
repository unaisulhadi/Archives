package com.hadi.archives.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TextInputField(label: String, value: String, onValueChanged: (String) -> Unit) {
    val keyboardController = LocalSoftwareKeyboardController.current

    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .padding(start = 20.dp, end = 20.dp),
        value = value,
        onValueChange = {
            onValueChanged(it)
        },
        leadingIcon = { LeadingIcon() },
        label = { LabelView(title = label) },
        textStyle = MaterialTheme.typography.body1,
        colors = textFieldColors(),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(
            onDone = {
                keyboardController?.hide()
            }
        )
    )

}


@Composable
fun LeadingIcon() {
    Icon(
        imageVector = Icons.Default.Search,
        contentDescription = null,
        modifier = Modifier
            .size(40.dp)
            .padding(start = 8.dp, end = 8.dp),
        tint = Color.White
    )
}

@Composable
fun LabelView(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.caption,
        textAlign = TextAlign.Start,
        color = MaterialTheme.colors.primaryVariant
    )

}

@Composable
fun textFieldColors() = TextFieldDefaults.textFieldColors(
    textColor = MaterialTheme.colors.primaryVariant,
    focusedLabelColor = MaterialTheme.colors.primary,
    focusedIndicatorColor = MaterialTheme.colors.primary,
    unfocusedIndicatorColor = Color.LightGray,
    cursorColor = MaterialTheme.colors.primary,
    placeholderColor = MaterialTheme.colors.onSurface,
    disabledPlaceholderColor = MaterialTheme.colors.onSurface
)

