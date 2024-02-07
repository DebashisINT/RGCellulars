package com.rgcellularsfsm.features.location.shopRevisitStatus

import com.rgcellularsfsm.features.location.shopdurationapi.ShopDurationApi
import com.rgcellularsfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}