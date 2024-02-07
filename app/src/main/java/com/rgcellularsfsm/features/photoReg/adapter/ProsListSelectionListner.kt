package com.rgcellularsfsm.features.photoReg.adapter

import com.rgcellularsfsm.features.photoReg.model.ProsCustom
import com.rgcellularsfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}