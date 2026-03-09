package com.mikitazayanchkouski.pexelskmp.di

import com.mikitazayanchkouski.pexelskmp.core.data.di.commonCoreDataModule
import com.mikitazayanchkouski.pexelskmp.features.listAndDetails.presentation.di.commonListAndDetailsPresentationModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(
            commonCoreDataModule,
            commonListAndDetailsPresentationModule
        )
    }
}