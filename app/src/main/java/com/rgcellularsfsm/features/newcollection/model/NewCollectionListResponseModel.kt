package com.rgcellularsfsm.features.newcollection.model

import com.rgcellularsfsm.app.domain.CollectionDetailsEntity
import com.rgcellularsfsm.base.BaseResponse
import com.rgcellularsfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}