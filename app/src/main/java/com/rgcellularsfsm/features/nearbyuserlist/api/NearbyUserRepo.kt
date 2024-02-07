package com.rgcellularsfsm.features.nearbyuserlist.api

import com.rgcellularsfsm.app.Pref
import com.rgcellularsfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.rgcellularsfsm.features.newcollection.model.NewCollectionListResponseModel
import com.rgcellularsfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}