package com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.curatedImagesScreen.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mikitazayanchkouski.pexelskmp.core.presentation.theme.PexelsTheme
import com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.curatedImagesScreen.viewModel.CuratedImagesActions
import com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.curatedImagesScreen.viewModel.CuratedImagesState
import com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.curatedImagesScreen.viewModel.CuratedImagesViewModel
import com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.models.CuratedImagesUiModel
import com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.models.ImageSrcUiModel
import com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.models.ImageUiModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun CuratedImagesRoot(
    viewModel: CuratedImagesViewModel = koinViewModel()
) {
    val imagesState by viewModel.state.collectAsStateWithLifecycle()

    CuratedImagesScreen(
        imagesState = imagesState,
        userAction = viewModel::onAction
    )
}

@Composable
private fun CuratedImagesScreen(
    imagesState: CuratedImagesState,
    userAction: (CuratedImagesActions) -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "CuratedImagesScreen")
    }
}

@Preview(
    name = "Portrait light theme",
    showSystemUi = true,
    showBackground = true,
    uiMode = AndroidUiModes.UI_MODE_NIGHT_NO,
    device = Devices.PIXEL_9
)
@Preview(
    name = "Tablet dark theme",
    showSystemUi = true,
    showBackground = true,
    uiMode = AndroidUiModes.UI_MODE_NIGHT_YES,
    device = Devices.PIXEL_TABLET
)
@Composable
private fun CuratedImagesScreenPreview() {
    PexelsTheme {
        Surface {
            CuratedImagesScreen(
                imagesState = CuratedImagesState(
                    isLoading = false,
                    dataError = null,
                    imagesList = listOf(
                        CuratedImagesUiModel(
                            pageNumber = 1,
                            amountPerPage = 1,
                            listOfImages = listOf(
                                ImageUiModel(
                                    id = 2014422,
                                    width = 3024,
                                    height = 3024,
                                    url = "https://www.pexels.com/photo/brown-rocks-during-golden-hour-2014422/",
                                    photographerName = "Joey Farina",
                                    photographerUrl = "https://www.pexels.com/@joey",
                                    photographerId = 680589,
                                    avgColor = "#978E82",
                                    imageResolutions = ImageSrcUiModel(
                                        original = "https://images.pexels.com/photos/2014422/pexels-photo-2014422.jpeg",
                                        large2x = "https://images.pexels.com/photos/2014422/pexels-photo-2014422.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                                        large = "https://images.pexels.com/photos/2014422/pexels-photo-2014422.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
                                        medium = "https://images.pexels.com/photos/2014422/pexels-photo-2014422.jpeg?auto=compress&cs=tinysrgb&h=350",
                                        small = "https://images.pexels.com/photos/2014422/pexels-photo-2014422.jpeg?auto=compress&cs=tinysrgb&h=130",
                                        portrait = "https://images.pexels.com/photos/2014422/pexels-photo-2014422.jpeg?auto=compress&cs=tinysrgb&fit=crop&h=1200&w=800",
                                        landscape = "https://images.pexels.com/photos/2014422/pexels-photo-2014422.jpeg?auto=compress&cs=tinysrgb&fit=crop&h=627&w=1200",
                                        tiny = "https://images.pexels.com/photos/2014422/pexels-photo-2014422.jpeg?auto=compress&cs=tinysrgb&dpr=1&fit=crop&h=200&w=280"
                                    ),
                                    liked = false,
                                    description = "Brown Rocks During Golden Hour"
                                )
                            ),
                            numberOfResultsForTheRequest = 1
                        )
                    )
                ),
                userAction = { action -> }
            )
        }
    }
}