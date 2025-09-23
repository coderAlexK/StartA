package com.akozlov.starta

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreenThree() {

    Box (contentAlignment = Center, modifier = Modifier.fillMaxSize()) {
        Column {
            Box (modifier = Modifier.width(160.dp)
                .height(120.dp)
                .background(Brush.linearGradient(colors = listOf(Color.Red, Color.Magenta, Color.Blue))
                    , shape = RoundedCornerShape(16.dp))) {
            }
            Box (modifier = Modifier.width(160.dp)
                .height(120.dp)
                .background(Brush.linearGradient(colors = listOf(Color.Red, Color.Magenta, Color.Blue))
                    , alpha = 0.5f
                    , shape = RoundedCornerShape(16.dp))) {
            }
            Box (modifier = Modifier
                .width(160.dp)
                .height(120.dp)
                .border(width = 2.dp
                    , brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Cyan))
                    , shape = RoundedCornerShape(16.dp))){

            }

        }
    }

}


@Preview(showSystemUi = true)
@Composable
fun ShowHomeScreenThree () {
    HomeScreenThree()
}