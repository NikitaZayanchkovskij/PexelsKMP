package com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.screens.curatedImagesScreen.viewModel

sealed interface CuratedImagesActions {
    data object OnRefresh : CuratedImagesActions
    data object OnLoadImages : CuratedImagesActions
    data class OnImageClick(val imageId: Int) : CuratedImagesActions
}