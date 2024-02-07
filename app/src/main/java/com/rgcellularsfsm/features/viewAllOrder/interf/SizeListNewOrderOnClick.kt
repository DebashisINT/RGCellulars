package com.rgcellularsfsm.features.viewAllOrder.interf

import com.rgcellularsfsm.app.domain.NewOrderProductEntity
import com.rgcellularsfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}