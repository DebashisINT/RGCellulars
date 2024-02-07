package com.rgcellularsfsm.features.login.model.productlistmodel

import com.rgcellularsfsm.app.domain.ModelEntity
import com.rgcellularsfsm.app.domain.ProductListEntity
import com.rgcellularsfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}