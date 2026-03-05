package com.mikitazayanchkouski.pexelskmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mikitazayanchkouski.pexelskmp.core.presentation.theme.PexelsTheme

@Composable
fun App() {
    val colorScheme = MaterialTheme.colorScheme

    PexelsTheme {
        Surface {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = colorScheme.background),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "This is my Pexels APP",
                    color = colorScheme.onSurface
                )
            }
        }
    }
}