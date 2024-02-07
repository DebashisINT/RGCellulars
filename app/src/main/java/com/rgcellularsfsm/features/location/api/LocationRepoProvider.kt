package com.rgcellularsfsm.features.location.api

import com.rgcellularsfsm.features.location.shopdurationapi.ShopDurationApi
import com.rgcellularsfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}