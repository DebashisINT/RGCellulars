package com.rgcellularsfsm.features.survey.api

import com.rgcellularsfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.rgcellularsfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}