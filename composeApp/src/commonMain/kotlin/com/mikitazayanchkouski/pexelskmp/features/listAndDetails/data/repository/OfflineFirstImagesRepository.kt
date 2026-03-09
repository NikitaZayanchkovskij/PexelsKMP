package com.mikitazayanchkouski.pexelskmp.features.listAndDetails.data.repository

import com.mikitazayanchkouski.pexelskmp.core.domain.customResultHandling.CustomResult
import com.mikitazayanchkouski.pexelskmp.core.domain.customResultHandling.DataError
import com.mikitazayanchkouski.pexelskmp.core.domain.customResultHandling.map
import com.mikitazayanchkouski.pexelskmp.features.listAndDetails.data.dataSource.remote.RemoteImagesDataSource
import com.mikitazayanchkouski.pexelskmp.features.listAndDetails.data.dataSource.remote.mappers.mapToDomainModel
import com.mikitazayanchkouski.pexelskmp.features.listAndDetails.domain.dataSource.remote.models.CuratedImagesDomainModel
import com.mikitazayanchkouski.pexelskmp.features.listAndDetails.domain.repository.ImagesRepository

class OfflineFirstImagesRepository(
    private val remoteDataSource: RemoteImagesDataSource
//    private val localDataSource: RoomLocalImagesDataSource
) : ImagesRepository {

    override suspend fun getCuratedImages(): CustomResult<CuratedImagesDomainModel, DataError.Remote> {
        return remoteDataSource.getCuratedImages().map { imagesDto ->
            imagesDto.mapToDomainModel()
        }
    }
}