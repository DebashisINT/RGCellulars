package com.rgcellularsfsm.features.viewAllOrder.orderOptimized

import com.rgcellularsfsm.app.domain.ProductOnlineRateTempEntity
import com.rgcellularsfsm.base.BaseResponse
import com.rgcellularsfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}