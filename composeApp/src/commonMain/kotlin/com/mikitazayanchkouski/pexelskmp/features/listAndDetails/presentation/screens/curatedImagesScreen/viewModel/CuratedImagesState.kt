package com.mikitazayanchkouski.pexelskmp.features.listAndDetails.presentation.screens.curatedImagesScreen.viewModel

import com.mikitazayanchkouski.pexelskmp.features.listAndDetails.presentation.models.CuratedImagesUiModel

data class CuratedImagesState(
    val isLoading: Boolean = false,
    val isDataReceivedSuccessfully: Boolean = false,
    val imagesList: CuratedImagesUiModel? = null
)
