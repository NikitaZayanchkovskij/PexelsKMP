package com.mikitazayanchkouski.pexelskmp.features.listAndDetails.domain.repository

import com.mikitazayanchkouski.pexelskmp.core.domain.customResultHandling.CustomResult
import com.mikitazayanchkouski.pexelskmp.core.domain.customResultHandling.DataError
import com.mikitazayanchkouski.pexelskmp.features.listAndDetails.domain.dataSource.remote.models.CuratedImagesDomainModel

interface ImagesRepository {
    suspend fun getCuratedImages(): CustomResult<CuratedImagesDomainModel, DataError.Remote>
}