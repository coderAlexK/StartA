package com.akozlov.starta

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun showTextField(text : State<String>, onValueChange: (String) -> Unit) {
    val textValue = text.value
    Row (modifier = Modifier.padding(start = 20.dp)) {
    OutlinedTextField(value = textValue, onValueChange = onValueChange)
}
}