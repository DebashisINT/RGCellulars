package com.rgcellularsfsm.features.viewAllOrder.interf

import com.rgcellularsfsm.app.domain.NewOrderGenderEntity
import com.rgcellularsfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}