package com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.curatedImagesScreen.viewModel

sealed interface CuratedImagesActions {
    data object OnRefresh : CuratedImagesActions
    data object OnLoadImages : CuratedImagesActions
    data class OnOpenImageDetails(val imageId: Int) : CuratedImagesActions
}