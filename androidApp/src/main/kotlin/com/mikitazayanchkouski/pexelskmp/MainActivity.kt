package com.mikitazayanchkouski.pexelskmp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.AndroidUiModes
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.mikitazayanchkouski.pexelskmp.core.presentation.theme.PexelsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App()
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
private fun AndroidAppPreview() {
    PexelsTheme {
        Surface {
            App()
        }
    }
}