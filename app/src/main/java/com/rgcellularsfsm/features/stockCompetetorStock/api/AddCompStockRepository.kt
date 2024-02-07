package com.rgcellularsfsm.features.stockCompetetorStock.api

import com.rgcellularsfsm.base.BaseResponse
import com.rgcellularsfsm.features.orderList.model.NewOrderListResponseModel
import com.rgcellularsfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.rgcellularsfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}