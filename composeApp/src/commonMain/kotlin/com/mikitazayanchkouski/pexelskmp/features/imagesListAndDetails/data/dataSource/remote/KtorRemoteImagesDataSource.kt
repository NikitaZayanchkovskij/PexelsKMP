package com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.data.dataSource.remote

import com.mikitazayanchkouski.pexelskmp.core.data.network.safeCall
import com.mikitazayanchkouski.pexelskmp.core.domain.customResultHandling.CustomResult
import com.mikitazayanchkouski.pexelskmp.core.domain.customResultHandling.DataError
import com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.data.dataSource.remote.ImagesNetworkConstants.CURATED_IMAGES
import com.mikitazayanchkouski.pexelskmp.features.imagesListAndDetails.data.dataSource.remote.models.CuratedImagesDto
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class KtorRemoteImagesDataSource(
    private val httpClient: HttpClient
) : RemoteImagesDataSource {

    override suspend fun getCuratedImages(): CustomResult<CuratedImagesDto, DataError.Remote> {
        return safeCall {
            httpClient.get(urlString = CURATED_IMAGES)
        }
    }
}