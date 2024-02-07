package com.rgcellularsfsm.features.myjobs.api

import android.content.Context
import android.net.Uri
import android.util.Log
import com.rgcellularsfsm.app.FileUtils
import com.rgcellularsfsm.base.BaseResponse
import com.rgcellularsfsm.features.activities.model.ActivityImage
import com.rgcellularsfsm.features.activities.model.AddActivityInputModel
import com.rgcellularsfsm.features.myjobs.model.WIPSubmit
import com.fasterxml.jackson.databind.ObjectMapper
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

object MyJobRepoProvider {
    fun jobRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.create())
    }

    fun jobMultipartRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.createMultiPart())
    }

}