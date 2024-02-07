package com.rgcellularsfsm.features.photoReg.present

import com.rgcellularsfsm.app.domain.ProspectEntity
import com.rgcellularsfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}