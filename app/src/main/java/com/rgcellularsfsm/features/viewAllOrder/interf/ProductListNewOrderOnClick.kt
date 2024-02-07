package com.rgcellularsfsm.features.viewAllOrder.interf

import com.rgcellularsfsm.app.domain.NewOrderGenderEntity
import com.rgcellularsfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}