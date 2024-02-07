package com.rgcellularsfsm.features.stockAddCurrentStock.api

import com.rgcellularsfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.rgcellularsfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}