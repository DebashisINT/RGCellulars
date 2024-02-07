package com.rgcellularsfsm.features.orderList.model

import com.rgcellularsfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}