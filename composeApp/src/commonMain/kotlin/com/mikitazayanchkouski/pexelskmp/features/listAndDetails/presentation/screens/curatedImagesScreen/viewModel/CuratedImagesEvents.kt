package com.mikitazayanchkouski.pexelskmp.features.listAndDetails.presentation.screens.curatedImagesScreen.viewModel

import org.jetbrains.compose.resources.StringResource

sealed interface CuratedImagesEvents {
    data class OnNavigateToImageDetails(val imageId: Int) : CuratedImagesEvents
    data class OnImagesLoadingFailed(val message: StringResource) : CuratedImagesEvents
}