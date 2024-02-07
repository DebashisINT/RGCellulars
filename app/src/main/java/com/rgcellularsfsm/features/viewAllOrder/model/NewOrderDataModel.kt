package com.rgcellularsfsm.features.viewAllOrder.model

import com.rgcellularsfsm.app.domain.NewOrderColorEntity
import com.rgcellularsfsm.app.domain.NewOrderGenderEntity
import com.rgcellularsfsm.app.domain.NewOrderProductEntity
import com.rgcellularsfsm.app.domain.NewOrderSizeEntity
import com.rgcellularsfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

