package com.mikitazayanchkouski.pexelskmp.features.listAndDetails.presentation.di

import com.mikitazayanchkouski.pexelskmp.features.listAndDetails.domain.repository.ImagesRepository
import com.mikitazayanchkouski.pexelskmp.features.listAndDetails.presentation.screens.home.curatedImagesScreen.viewModel.CuratedImagesViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val commonListAndDetailsPresentationModule = module {
    viewModel<CuratedImagesViewModel> {
        CuratedImagesViewModel(imagesRepository = get<ImagesRepository>())
    }
}