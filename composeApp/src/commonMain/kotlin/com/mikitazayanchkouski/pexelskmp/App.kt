package com.mikitazayanchkouski.pexelskmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.mikitazayanchkouski.pexelskmp.core.presentation.theme.PexelsTheme

@Composable
fun App() {
    val colorScheme = MaterialTheme.colorScheme

    PexelsTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            contentWindowInsets = WindowInsets.safeDrawing
        ) { paddingValues ->
            Surface(
                modifier = Modifier
                    .padding(paddingValues = paddingValues)
                    .fillMaxSize(),
                color = colorScheme.background
            ) {
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
}

@Preview(
    name = "Portrait light theme",
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_9,
    uiMode = AndroidUiModes.UI_MODE_NIGHT_NO
)
@Preview(
    name = "Tablet dark theme",
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_TABLET,
    uiMode = AndroidUiModes.UI_MODE_NIGHT_YES
)
@Composable
private fun AppPreview() {
    PexelsTheme {
        Surface {
            App()
        }
    }
}