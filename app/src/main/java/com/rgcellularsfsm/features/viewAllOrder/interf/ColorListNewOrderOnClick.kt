package com.rgcellularsfsm.features.viewAllOrder.interf

import com.rgcellularsfsm.app.domain.NewOrderColorEntity
import com.rgcellularsfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}