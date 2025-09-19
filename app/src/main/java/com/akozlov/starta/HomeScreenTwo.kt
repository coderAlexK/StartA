package com.akozlov.starta

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment.Companion.Start

@Composable
fun HomeScreenTwo () {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Title", fontSize = 30.sp, modifier = Modifier.padding(top = 30.dp))
        Text(text = "Description",
            fontSize = 24.sp,
            modifier = Modifier.align(Start))

        Row (verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Name", fontSize = 24.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Surname", fontSize = 24.sp)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Age", fontSize = 24.sp)
        }
        Box() {
            Text(text = "N", fontSize = 48.sp)
            Text(text = "ame", fontSize = 16.sp)

        }
    }

}


@Preview (showSystemUi = true)
@Composable
fun ShowHomeScreenTwo () {
    HomeScreenTwo()
}