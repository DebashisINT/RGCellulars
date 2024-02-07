package com.rgcellularsfsm.features.viewAllOrder.interf

import com.rgcellularsfsm.app.domain.NewOrderGenderEntity
import com.rgcellularsfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}