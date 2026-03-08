package com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.screens.curatedImagesScreen.viewModel

import org.jetbrains.compose.resources.StringResource

sealed interface CuratedImagesEvents {
    data class OnNavigateToImageDetails(val imageId: Int) : CuratedImagesEvents
    data class OnImagesLoadingFailed(val message: StringResource) : CuratedImagesEvents
}