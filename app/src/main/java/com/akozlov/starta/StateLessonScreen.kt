package com.akozlov.starta

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

@Composable
fun TextClickerScreen(counter: State<Int>, onCounterClick: () -> Unit) {
    val counterValue = counter.value
    Text(text = "Количество кликов: $counterValue"
        , fontSize = 28.sp, modifier = Modifier
            .padding(all = 30.dp)
            .clickable(onClick = onCounterClick))
}

//@SuppressLint("UnrememberedMutableState")
//@Preview(showSystemUi = true)
//@Composable
//fun ShowTextClickerScreen() {
//    var counter: State<Int> = mutableStateOf(0)
//    TextClickerScreen(counter = counter, onCounterClick = {counter.value + 1})
//}