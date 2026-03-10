package com.mikitazayanchkouski.pexelskmp.features.listAndDetails.presentation.screens.home.curatedImagesScreen.viewModel

sealed interface CuratedImagesActions {
    data object OnRefresh : CuratedImagesActions
    data object OnLoadImages : CuratedImagesActions
    data class OnNavigateToImageDetails(val imageId: Long) : CuratedImagesActions
}