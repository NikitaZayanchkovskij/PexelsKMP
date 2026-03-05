package com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.presentation.curatedImagesScreen.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn

class CuratedImagesViewModel : ViewModel() {

    private var isInitialDataLoaded = false

    private val _state = MutableStateFlow(value = CuratedImagesState())
    val state = _state
        /* We can also use init block of the view model,
         * but then in test cases, there will be no way to initialize
         * the view model, without initializing the data loading.
         *
         * This onStart block is called when the first collector appears.
         * For example when we call on the screen:
         * val imagesState by viewModel.state.collectAsStateWithLifecycle()
         */
        .onStart {
            if (!isInitialDataLoaded) {
                loadImages()
                isInitialDataLoaded = true
            }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(stopTimeoutMillis = 5_000L),
            initialValue = CuratedImagesState()
        )

    fun onAction(action: CuratedImagesActions) {
        when (action) {
            is CuratedImagesActions.OnOpenImageDetails -> println("OnOpenImageDetails")
            CuratedImagesActions.OnRefresh -> println("OnRefresh")
            CuratedImagesActions.OnLoadImages -> loadImages()
        }
    }

    private fun loadImages() {
        println("OnLoadImages")
    }
}