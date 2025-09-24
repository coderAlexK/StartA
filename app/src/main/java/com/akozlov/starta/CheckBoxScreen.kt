package com.akozlov.starta

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CheckBoxScreen(checked: State<Boolean>, onCheckedChange: (Boolean) -> Unit) {
    val checkedValue =checked.value
    Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 40.dp)){
        Checkbox(checked = checkedValue, onCheckedChange = onCheckedChange)
        Text(text = "Some checkbox text", fontSize = 28.sp)

}
}

//val checked = mutableStateOf(true)
//@Preview(showSystemUi = true)
//@Composable
//fun CheckBoxScreenShow() {
//    CheckBoxScreen(checked = checked
//        , onCheckedChange = {newCheckedValue -> checked.value = newCheckedValue})
//}