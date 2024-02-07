package com.rgcellularsfsm.features.stockAddCurrentStock.api

import com.rgcellularsfsm.base.BaseResponse
import com.rgcellularsfsm.features.location.model.ShopRevisitStatusRequest
import com.rgcellularsfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.rgcellularsfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.rgcellularsfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.rgcellularsfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}