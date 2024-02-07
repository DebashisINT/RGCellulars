package com.rgcellularsfsm.features.location.shopRevisitStatus

import com.rgcellularsfsm.base.BaseResponse
import com.rgcellularsfsm.features.location.model.ShopDurationRequest
import com.rgcellularsfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}