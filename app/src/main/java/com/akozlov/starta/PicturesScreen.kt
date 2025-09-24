package com.akozlov.starta


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PictureScreen () {
    Box(contentAlignment = Center, modifier = Modifier.fillMaxSize() ){
        Image(
            painter = painterResource(id = R.drawable.sand)
            , contentDescription = null
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_foreground)
            , contentDescription = null

        )

    }
}


@Preview(showSystemUi = true)
@Composable
fun ShowPictureScreen() {
PictureScreen()
}