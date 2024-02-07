package com.rgcellularsfsm.features.dashboard.presentation.api.dayStartEnd

import com.rgcellularsfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.rgcellularsfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}