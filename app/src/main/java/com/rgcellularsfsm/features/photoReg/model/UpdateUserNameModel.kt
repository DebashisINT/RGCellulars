package com.rgcellularsfsm.features.photoReg.model

import com.rgcellularsfsm.app.Pref
import com.rgcellularsfsm.base.BaseResponse

data class UpdateUserNameModel (var session_token:String,var name_updation_user_id:String,
 var updated_name:String,var updated_first_name:String,var updated_middle_name:String,var updated_last_name:String,
 var updated_by_user_id:String,var updation_date_time:String)
{
    constructor():this(
            Pref.session_token!!,"","","","","",
            Pref.user_id.toString(),""
    )
}

class UpdateUserNameResponse :BaseResponse(){
    var updated_name:String?=null
}