package com.example.merrychristmas.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.merrychristmas.R

@Composable
fun ComposeLottieScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
    ){
        ComposeLottieAnimation(modifier = Modifier.align(alignment = Alignment.Center))
    }
}

@Composable
fun ComposeLottieAnimation(modifier: Modifier) {

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.santa))

    LottieAnimation(
        modifier = modifier,
        composition = composition,
        iterations = LottieConstants.IterateForever,
    )
}

@Preview
@Composable
fun MainScreenPreview() {
    ComposeLottieScreen()
}