package com.mikitazayanchkouski.pexelskmp.features.listAndDetails.data.dataSource.remote

import com.mikitazayanchkouski.pexelskmp.core.domain.customResultHandling.CustomResult
import com.mikitazayanchkouski.pexelskmp.core.domain.customResultHandling.DataError
import com.mikitazayanchkouski.pexelskmp.features.listAndDetails.data.dataSource.remote.models.CuratedImagesDto

interface RemoteImagesDataSource {
    suspend fun getCuratedImages(): CustomResult<CuratedImagesDto, DataError.Remote>
}