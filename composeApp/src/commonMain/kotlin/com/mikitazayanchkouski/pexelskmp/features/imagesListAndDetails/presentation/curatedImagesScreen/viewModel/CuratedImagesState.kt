package com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.curatedImagesScreen.viewModel

import com.mikitazayanchkouski.pexelskmp.core.domain.customResultHandling.DataError
import com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.models.CuratedImagesUiModel

data class CuratedImagesState(
    val isLoading: Boolean = false,
    val dataError: DataError? = null,
    val imagesList: List<CuratedImagesUiModel> = emptyList()
)
