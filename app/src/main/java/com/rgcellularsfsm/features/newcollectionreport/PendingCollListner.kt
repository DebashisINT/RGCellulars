package com.rgcellularsfsm.features.newcollectionreport

import com.rgcellularsfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}